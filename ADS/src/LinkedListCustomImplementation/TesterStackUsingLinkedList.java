package LinkedListCustomImplementation;

public class TesterStackUsingLinkedList {

    public static void main(String[] args) {
        StackUsingLinkedList list = new StackUsingLinkedList();
        System.out.println(list.peek());
        list.pop();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        System.out.println("\n");
        list.display();
        System.out.println("\n");
        System.out.println(list.peek());
        list.pop();
        System.out.println(list.peek());
        list.pop();
        System.out.println(list.peek());
        list.pop();
        System.out.println(list.peek());
        list.pop();
        System.out.println(list.peek());
        list.pop();
        System.out.println("\n");
        list.display();
    }

}
