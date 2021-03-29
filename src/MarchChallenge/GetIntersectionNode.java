package MarchChallenge;


public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;
        ListNode result = null;


        while (tempA != null && tempB != null) {
            tempA = tempA.next;
            tempB = tempB.next;

            if (tempA.val == tempB.val) {

                result.val = tempA.val;

            }
        }

        return result;


    }

    public static void main(String[] args) {
        GetIntersectionNode u = new GetIntersectionNode();
        ListNode listA = null;
        ListNode listB = null;

        int[] arrA = {4, 1, 8, 4, 5};
        int[] arrB = {5, 6, 1, 8, 4, 5};

        for (int i = 0; i < arrA.length; i++) {
            listA = new ListNode(arrA[i]);
            listA = listA.next;
        }

        for (int i = 0; i < arrB.length; i++) {
            listB = new ListNode(arrB[i]);
            listB = listB.next;
        }




    }


}
