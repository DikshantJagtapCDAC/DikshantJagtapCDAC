package queueUsingArrays;

public class TesterOptimizedSpaceQueue {

    // Driver code
    public static void main(String[] args)
    {
        // Create a queue of capacity 4
        OptimizedSpaceQueue q = new OptimizedSpaceQueue(4);

        // print Queue elements
        q.queueDisplay(); //Queue is Empty

        // inserting elements in the queue
        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);

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
        q.queueFront();

        // inserting elements in the queue
        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);

        q.queueDisplay();
    }
}
