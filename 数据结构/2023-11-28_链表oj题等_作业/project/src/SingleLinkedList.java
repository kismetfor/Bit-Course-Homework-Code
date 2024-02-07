public class SingleLinkedList implements IList{
    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    @Override
    public void addFirst(int data) {

    }

    @Override
    public void addLast(int data) {

    }

    @Override
    public boolean addIndex(int index, int data) {
        return false;
    }

    @Override
    public boolean contains(int key) {
        return false;
    }

    @Override
    public void remove(int key) {

    }

    @Override
    public void removeAllKey(int key) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void display() {

    }

    @Override
    public void clear() {

    }
}
