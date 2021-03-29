package DataStructures;

public class SinglyLinkedList {
    SinglyLinkedListNode head;

    public void printList(String listID) {


        SinglyLinkedListNode n = head;

        System.out.print("Printing list -> " + listID);
        System.out.print(": " + n.data);

        n = n.next;

        while (n != null) {
            System.out.print(", " + n.data);
            n = n.next;
        }
        System.out.println(";");
    }

    public static void main(String[] args) {


        SinglyLinkedList listA = new SinglyLinkedList();
        SinglyLinkedList listB = new SinglyLinkedList();
        String listAType = "List A";
        String listBType = "List B";

        listA.head = new SinglyLinkedListNode(12);
        SinglyLinkedListNode oneA = new SinglyLinkedListNode(9);
        SinglyLinkedListNode twoA = new SinglyLinkedListNode(3);
        SinglyLinkedListNode threeA = new SinglyLinkedListNode(7);
        SinglyLinkedListNode fourA = new SinglyLinkedListNode(8);
        SinglyLinkedListNode fiveA = new SinglyLinkedListNode(5);
        listA.head.next = oneA;
        oneA.next = twoA;
        twoA.next = threeA;
        threeA.next = fourA;
        fourA.next = fiveA;
        listA.printList(listAType);

        listB.head = new SinglyLinkedListNode(11);
        SinglyLinkedListNode oneB = new SinglyLinkedListNode(1);
        SinglyLinkedListNode twoB = new SinglyLinkedListNode(4);
        SinglyLinkedListNode threeB = new SinglyLinkedListNode(7);
        SinglyLinkedListNode fourB = new SinglyLinkedListNode(8);
        SinglyLinkedListNode fiveB = new SinglyLinkedListNode(5);
        listB.head.next = oneB;
        oneB.next = twoB;
        twoB.next = threeB;
        threeB.next = fourB;
        fourB.next = fiveB;
        listB.printList(listBType);


    }
}
