public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode dummy = new ListNode(0);
        ListNode p1 = dummy;
        while (l1!=null || l2!=null){
            if(l1!=null){
                if (l2!=null){
                    if(l1.val>l2.val){
                        p1.next = new ListNode(l2.val);
                        p1 = p1.next;
                        l2 = l2.next;
                    }else{
                        p1.next = new ListNode(l1.val);
                        p1 = p1.next;
                        l1 = l1.next;
                    }
                }else{
                    p1.next = new ListNode(l1.val);
                    p1 = p1.next;
                    l1 = l1.next;
                }
            }else{
                p1.next = new ListNode(l2.val);
                p1 = p1.next;
                l2 = l2.next;
            }
        }
        return dummy.next;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(9);
        l1.next = l2; l2.next = l3; l3.next = l4; l4.next = l5;
        ListNode j1 = new ListNode(2);
        ListNode j2 = new ListNode(4);
        ListNode j3 = new ListNode(6);
        ListNode j4 = new ListNode(8);
        ListNode j5 = new ListNode(10);
        j1.next = j2; j2.next = j3; j3.next = j4; j4.next = j5;
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode res = solution.mergeTwoLists(l1,j3);
        while(res!=null){

            System.out.print(res.val+ "  ");
            res = res.next;
        }
    }

}
