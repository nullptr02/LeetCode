package Algorithms;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode current = new ListNode();
        int count = 0;


        ListNode a;
        ListNode b;
        ListNode c;
        ListNode d;
        ListNode e;
        e = new ListNode(25, null);
        d = new ListNode(20, e);
        c = new ListNode(15, d);
        b = new ListNode(10, c);
        a = new ListNode(5, b);


        head.next = a;
        while (head.next != null) {
            count++;
            current = current.next;
        }

        System.out.println(count);

        return result;

    }

    public static void main(String[] args) {
        MiddleNode u = new MiddleNode();


        u.middleNode();
    }
}
