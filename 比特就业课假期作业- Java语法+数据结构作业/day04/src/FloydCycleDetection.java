class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class FloydCycleDetection {
    public static void main(String[] args) {
        // 创建链表：4 -> 3 -> 7 -> 8 -> 6 -> 9 -> 2 -> 1 -> 5 -> 2
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(7);
        ListNode node4 = new ListNode(8);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(2);
        ListNode node8 = new ListNode(1);
        ListNode node9 = new ListNode(5);
        ListNode node10 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node3; // 创建环，最后一个节点指向链表中的某个节点

        // 创建 FloydCycleDetection 实例
        FloydCycleDetection floydCycleDetection = new FloydCycleDetection();

        // 调用 detectCycle 方法检测环的起始节点
        ListNode cycleStartNode = floydCycleDetection.detectCycle(node1);

        // 输出结果
        if (cycleStartNode != null) {
            System.out.println("链表中存在环，环的起始节点值为: " + cycleStartNode.val);
        } else {
            System.out.println("链表中不存在环");
        }
    }
    public static ListNode detectCycle(ListNode head) {
        // 初始化两个指针，初始位置为链表起始点
        ListNode slow = head;
        ListNode fast = head;

        // 判断是否存在环
        while (true) {
            // 慢指针每次移动一个节点
            slow = slow.next;

            // 快指针每次移动两个节点
            if (fast != null && fast.next != null) {
                fast = fast.next.next;
            } else {
                // 如果快指针达到链表末尾，说明链表无环
                return null;
            }

            // 如果相遇，说明链表中存在环，退出循环
            if (slow == fast) {
                break;
            }
        }

        // 重新将慢指针指向链表起始点
        slow = head;

        // 寻找环的起始点
        while (slow != fast) {
            // 同时移动慢指针和快指针，直到相遇
            slow = slow.next;
            fast = fast.next;
        }

        // 返回环的起始点
        return slow;
    }
}
