package easy;

public class ReverseLinkedList_206 {

    // https://www.youtube.com/watch?v=NhapasNIKuQ

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while(head != null) {
            ListNode next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }

        return prev;
    }


}
