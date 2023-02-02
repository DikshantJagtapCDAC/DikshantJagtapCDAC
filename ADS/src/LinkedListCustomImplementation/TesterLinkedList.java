package LinkedListCustomImplementation;

public class TesterLinkedList {
    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        /*list.insertAtIndex( 99,-1);
        list.insertAtIndex( 1,-1);*/

        //list.insertAtTheBegin( -1);
        list.insertAtTheEnd( 1);
        list.insertAtTheEnd( 2);
        list.insertAtTheEnd( 3);
        list.insertAtTheEnd( 4);
        list.insertAtTheEnd( 5);
        list.insertAtTheEnd( 6);
        list.insertAtTheEnd( 7);
        list.insertAtTheEnd( 8);
        list.insertAtIndex( 1,-1);
        //list.insertAtIndex( 1,-2);
        list.insertAtIndex( 2,99);
        /*list.insertAtTheBegin( 0);

        list.insertAtTheBegin( 0);
*/
        // Print the LinkedList
        list.printList(); //LinkedList: 1 2 3 4 5 6 7 8

        //print the count
        System.out.println("\n Using count as a instance variable: "  + list.getCount()); //8

        // Print the LinkedList
        System.out.println("\n Using iteration to get count: " + list.countNodesInList()); //8
    }
}
