public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if( head == null)
            return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p1 = dummy, p2 = dummy;
        for (int i=0; i<n; i++){
            p1 = p1.next;
        }

        while(p1.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        p2.next = p2.next.next;

        return dummy.next;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;
        RemoveNthNodeFromEndofList solution = new RemoveNthNodeFromEndofList();
        ListNode res = solution.removeNthFromEnd(l1,2);
        while (res.next!= null){
            System.out.print(res.val + "  ");
            res = res.next;

        }
    }
}
