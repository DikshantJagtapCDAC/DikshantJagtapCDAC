package DoublyLinkedList;

//A node class for doubly linked list
class Node {
    int item;
    Node previous;
    Node next;

    public Node(int item) {
        this.item = item;
        this.next = null;
        this.previous =null;
    }
}

class DoublyLinkedList {

    //Initially, head and tail is set to null
    Node head, tail = null;
    //add a node to the list
    public void addNode(int item) {
        //Create a new node
        Node newNode = new Node(item);

        //if list is empty, head and tail points to newNode
        if (head == null) {
            head = tail = newNode;
            //head's previous will be null
            head.previous = null;
            //tail's next will be null
            tail.next = null;
        } else {
            //add newNode to the end of list. tail->next set to newNode
            tail.next = newNode;
            //newNode->previous set to tail
            newNode.previous = tail;
            //newNode becomes new tail
            tail = newNode;
            //tail's next point to null
            tail.next = null;
        }
    }

    //print all the nodes of doubly linked list
    public void printNodes() {
        //Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            //Print each node and then go to next.
            System.out.print(current.item + " ");
            current = current.next;
        }
    }

    //print all the nodes of doubly linked list
    public void printNodesInReverseOrder() {
        //Node current will point to head
        Node current = tail;
        if (tail == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != head) {
            //Print each node and then go to next.
            System.out.print(current.item + " ");
            current = current.previous;
        }
        System.out.print(current.item + " ");
    }
}

class DLL {
    public static void main(String[] args) {
        //create a DoublyLinkedList object
        DoublyLinkedList dll = new DoublyLinkedList();
        //Add nodes to the list
        dll.addNode(10);
        dll.addNode(20);
        dll.addNode(30);
        dll.addNode(40);
        dll.addNode(50);

        //print the nodes of DoublyLinkedList
        dll.printNodes();

        dll.printNodesInReverseOrder();
    }
}