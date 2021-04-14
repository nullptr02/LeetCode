package AprilChallenge;

public class LinkedList {

    ListNode head;

    public static LinkedList insert(LinkedList list, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = null;

        // If the list is empty initialize the first node with data
        if (list.head == null) {
            list.head = newNode;
        } else {

            //You have to get to the last node in order to add a new node
            ListNode last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }


        return list;
    }

    public static int getListSize(LinkedList list) {
        int listSize = 0;
        ListNode index = list.head;
        while (index != null) {
            listSize++;
            index = index.next;

        }

        return listSize;
    }


    public static void printList(LinkedList list) {
        ListNode currentNode = list.head;

        System.out.print("Contents of LinkedList: ");

        int i = 0;
        int listSize = getListSize(list);
        while (currentNode != null) {
            System.out.print(currentNode.data);

            if (i < listSize - 1) {
                System.out.print(", ");

            }
            i++;
            currentNode = currentNode.next;
        }

        System.out.println("\nList size = " + listSize);

    }

    public static LinkedList partition(LinkedList list, int x) {

        // before and after are the two pointers used to create the two list
        // before_head and after_head are used to save the heads of the two lists.
        // All of these are initialized with the dummy nodes created.
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while (head != null) {

            // If the original list node is lesser than the given x,
            // assign it to the before list.
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                // If the original list node is greater or equal to the given x,
                // assign it to the after list.
                after.next = head;
                after = after.next;
            }

            // move ahead in the original list
            head = head.next;
        }

        // Last node of "after" list would also be ending node of the reformed list
        after.next = null;

        // Once all the nodes are correctly assigned to the two lists,
        // combine them to form a single list which would be returned.
        before.next = after_head.next;

        return before_head.next;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insert(list, 1);
        list = insert(list, 4);
        list = insert(list, 3);
        list = insert(list, 2);
        list = insert(list, 5);
        list = insert(list, 2);

        partition(list, 3);

    }
}
