public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p1 = dummy;
        while (p1.next != null && p1.next.next != null) {
            ListNode p2 = p1.next;
            ListNode p3 = p2.next;
            p2.next = p3.next;
            p1.next = p3;
            p3.next = p2;

            p1 = p1.next.next;
        }
        return dummy.next;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);

        SwapNodesInPairs solution = new SwapNodesInPairs();
        ListNode res = solution.swapPairs(l1);
        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
