

public class AddTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        int carry = 0;
        while (l1 !=null || l2 != null || carry != 0 ) {
            int a = l1!=null? l1.val : 0;
            int b = l2!=null? l2.val : 0;
            int val = a + b + carry;
            cur.next = new ListNode(val%10);
            carry = val / 10;
            l1 = l1!=null ? l1.next : null;
            l2 = l2!=null ? l2.next : null;
            cur = cur.next;
        }

        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(3);
        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(4);

        a1.next = a2;
        a2.next = a3;
        b1.next = b2;
        b2.next = b3;

        AddTwoNums solution = new AddTwoNums();
        ListNode res = solution.addTwoNumbers(a1, b1);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }

    }
}
