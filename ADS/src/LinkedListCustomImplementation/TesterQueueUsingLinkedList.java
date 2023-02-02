package LinkedListCustomImplementation;

public class TesterQueueUsingLinkedList {

    public static void main(String[] args) {
        QueueUsingLinkedList list = new QueueUsingLinkedList();
        System.out.println(list.deQueElement()); //-999
        list.enQueElement(1);
        //1
        list.enQueElement(11);
        //1 11
        list.enQueElement(111);
        //1 11 111
        list.enQueElement(1111);
        //1 11 111 1111
        list.printList(); //LinkedList: 1 11 111 1111
        System.out.println("\n count " + list.getCount()); //4
        System.out.println("\n deQueElement " + list.deQueElement()); //1
        System.out.println("\n count " +list.getCount()); //3
        System.out.println("\n deQueElement " + list.deQueElement()); //11
        System.out.println("\n count " +list.getCount()); //2
        System.out.println("\n deQueElement " + list.deQueElement()); //111
        System.out.println("\n count " +list.getCount()); //1
        System.out.println("\n deQueElement " + list.deQueElement()); //1111
        System.out.println("\n count " +list.getCount()); //0
        System.out.println("\n deQueElement " + list.deQueElement()); //-999
        System.out.println("\n count " +list.getCount()); //0
        list.printList(); //LinkedList:
    }

}
