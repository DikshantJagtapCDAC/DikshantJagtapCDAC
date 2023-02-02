package LinkedListCustomImplementation;



import java.io.*;

public class QueueUsingLinkedList {

    private Node head; // point to head node of list
    private Node tail; // point to last node of the list
    private int count; //count of nodes

    /*// Method to insert a new node
    public void insertAtTheRearEnd(int data) {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (head == null) {
            head = newNode;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at last node
            last.next = newNode;
        }
        this.count = this.count + 1;
    }*/

    public void enQueElement(int data) {
        insertAtTheEndUsingTail(data);
    }

    /**
     * Return the first element in the linked list.
     */
    public int deQueElement() {
        if (head != null) {
            int startElement = head.data;
            head = head.next;
            this.count = this.count - 1;
            return startElement;
        }
        return -999;
    }

    // Method to print the LinkedList.
    public void printList() {
        Node currNode = head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    // Method to insert a new node
    public void insertAtTheEndUsingTail(int data) {
        // Create a new node with given data
        Node newNode = new Node(data);
        // If the Linked List is empty, then make head and tail point to new node
        if (head == null) {
            head = newNode;
            tail=head;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        this.count = this.count + 1;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
