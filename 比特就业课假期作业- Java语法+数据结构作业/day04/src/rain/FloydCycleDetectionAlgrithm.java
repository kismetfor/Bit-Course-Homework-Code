package rain;

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}
public class FloydCycleDetectionAlgrithm {
    public static void main(String[] args) {
        ListNode node0 = new ListNode(4);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(7);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(6);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(2);
        ListNode node7 = new ListNode(1);
        ListNode node8 = new ListNode(5);
        ListNode node9 = new ListNode(2);

        node0.next = node4;
        node1.next = node3;
        node2.next = node7;
        node3.next = node8;
        node4.next = node6;
        node5.next = node9;
        node6.next = node2;
        node7.next = node1;
        node8.next = node5;
        node9.next = node2;
    }

}
