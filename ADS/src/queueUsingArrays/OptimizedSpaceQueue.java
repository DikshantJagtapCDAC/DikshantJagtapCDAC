package queueUsingArrays;

// Java program to implement a queue using an array
public class OptimizedSpaceQueue {
    private int front, rear, capacity;
    private int queue[];

    OptimizedSpaceQueue(int capacity)
    {
        front = rear = 0;
        this.capacity = capacity;
        queue = new int[this.capacity];
    }

    // function to insert an element
    // at the rear of the queue
    /*
    Enqueue: Addition of an element to the queue. Adding an element will be performed after checking
    whether the queue is full or not. If rear < capacity which indicates that the array is not full
    then store the element at arr[rear] and increment rear by 1 but if rear == capacity then it is
    said to be an Overflow condition as the array is full.
     */
    void queueEnqueue(int data)
    {
        // check queue is full or not
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        }

        // insert element at the rear
        else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    /*
        // 0 1 2 3
        // capacity = 4
        //rear = 0
        //20 30 40
        //rear = 3
        //capacity = 4
     */
    // function to delete an element
    // from the front of the queue
    /*
    Dequeue: Removal of an element from the queue. An element can only be deleted when there is at least an element
    to delete i.e. rear > 0. Now, the element at arr[front] can be deleted but all the remaining elements have to
    shift to the left by one position in order for the dequeue operation to delete the second element from the left
    on another dequeue operation.
     */
    void queueDequeue()
    {
        // if queue is empty
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        }

        // shift all the elements from index 2 till rear
        // to the right by one
        else {
            System.out.println(queue[front]);
            //shift left operation
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
                /*
                queue[0] = queue[1] when i=0
                queue[1] = queue[2] when i=1
                queue[2] = queue[3] when i=2
                ............
                 */
            }

            // store 0 at rear indicating there's no element
            if (rear < capacity)
                queue[rear] = 0;

            // decrement rear
            rear--;
        }
        return;
    }

    // print queue elements
    /*
    Display: Print all elements of the queue. If the queue is non-empty, traverse and
    print all the elements from the index front to rear.
     */
    void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    // print front of queue
    /*
    Front: Get the front element from the queue i.e. arr[front] if the queue is not empty.
     */
    void queueFront()
    {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d",
                queue[front]);
        return;
    }
}

