package LinkedListCustomImplementation;

import java.io.*;

public class LinkedList {

    private Node head; // head of list
    private int count;

    // Method to insert a new node
    public void insertAtTheEnd(int data) {
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
    }

    public void pushElement(int data) {
        insertAtTheEnd(data);
    }

    /**
     * Return the first element in the linked list.
     */
    public int popElement() {
        if (head != null) {
            int topElement = head.data;

            head = head.next;

            return topElement;
        }
        return -999;
    }

    // Method to insert a new node
    public void insertAtTheBegin(int data) {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        this.count = this.count + 1;
    }

    //5
    // Method to insert a new node at a given position
    public void insertAtIndex(int position, int data) {
        if (position > (count + 1) || position < 0) {
            System.out.println("Invalid Position");
            return;
        }
        // If the Linked List is empty, then make the new node as head
        if (head == null || position == 1) {
            insertAtTheBegin(data);
        } else {
            // Create a new node with given data
            Node newNode = new Node(data);
            Node currNode = head;
            int index = 1;
            while (currNode.next != null) {
                if ((position - 1) == index) {
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                    break;
                }
                index++;
                currNode = currNode.next;
            }
            this.count = this.count + 1;
        }
        return;
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

    public int countNodesInList() {
        int counter = 0;
        Node currNode = head;

        //System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            //System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
            counter++;
        }
        return counter;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
