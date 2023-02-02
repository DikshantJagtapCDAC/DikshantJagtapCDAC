package LinkedListCustomImplementation;// Java program to Implement a stack
// using singly linked list
// import package
import static java.lang.System.exit;

// Create Stack Using Linked list
public class StackUsingLinkedList {

    // create global top reference variable global
    Node top;

    // Utility function to add an element x in the stack
    public void push(int x) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node newNode = new Node(x);
        // put top reference into next link
        newNode.next = top;
        // update top reference
        top = newNode;
    }

    // Utility function to check if the stack is empty or
    // not
    public boolean isEmpty() { return top == null; }

    // Utility function to return top element in a stack
    public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Utility function to pop top element from the stack
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        // update the top pointer to point to the next node
        top = (top).next;
    }

    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {
                // print node data
                System.out.print(temp.data);
                // assign temp link to temp
                temp = temp.next;
                if(temp != null)
                    System.out.print(" -> ");
            }
        }
    }
}
