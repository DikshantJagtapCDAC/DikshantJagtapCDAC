package queueUsingArrays;

public class TesterQueue {

    // Driver code
    public static void main(String[] args)
    {
        // Create a queue of capacity 4
        Queue q = new Queue(4);

        // print Queue elements
        q.queueDisplay(); //Queue is Empty

        // inserting elements in the queue
        q.queueEnqueue(20); //20
        q.queueEnqueue(30); //20 30
        q.queueEnqueue(40); //20 30 40
        q.queueEnqueue(50); //20 30 40 50

        q.queueEnqueue(60); //full

        // print Queue elements
        q.queueDisplay(); //20 30 40 50

        // insert element in the queue
        q.queueEnqueue(60); //full

        // print Queue elements
        q.queueDisplay(); //20 30 40 50

        q.queueDequeue(); //20
        //30 40 50
        q.queueDequeue(); //30
        //40 50
        System.out.printf(
                "\n\nafter two node deletion\n\n");

        // print Queue elements
        q.queueDisplay(); // 40 50

        // print front of the queue
        q.queueFront(); // 40
        // 40 50
        // inserting elements in the queue
        q.queueEnqueue(1);
        q.queueEnqueue(2);
        q.queueEnqueue(3);
        q.queueEnqueue(4);

        q.queueDisplay();
    }
}
