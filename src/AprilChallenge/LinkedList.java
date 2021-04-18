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
        ListNode index = list.head;
        LinkedList newList = new LinkedList();


        // Copy all values less than target 'X' into 'newList'
        while (index != null) {
            int val = index.data;
            if (val < x) {
                newList = insert(newList, val);
            }
            index = index.next;
        }


        // Get the last node and save it in a variable
        ListNode last = newList.head;
        while (last.next != null) {
            last = last.next;
        }
        ListNode newNode = new ListNode(6);
        last.next = newNode;



        // Loop through original list and add all values greater than or equal to target value
        while (index != null) {

            int val = index.data;
            if (val >= x) {
                newList = insert(newList, val);
            }

            index = index.next;
            last = last.next;

        }


        printList(newList);


        return newList;
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
