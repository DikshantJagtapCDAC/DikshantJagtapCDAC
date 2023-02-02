package circularQueueUsingArray;

public class TesterCircularQueue {

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        System.out.println(q.isEmpty()); //true
        q.enqueue(5); //5
        q.enqueue(4); //5 4
        q.enqueue(6); //5 4 6
        q.enqueue(10); //5 4 6 10
        q.enqueue(46); //5 4 6 10 46
        //q.enqueue(56); //full
        System.out.println(q.dequeue()); //5
        // 4 6 10 46
        System.out.println(q.dequeue()); //4
        // 6 10 46
        System.out.println(q.dequeue()); // 6
        // 10 46
        System.out.println(q.dequeue()); // 10
        // 46
        System.out.println(q.dequeue()); // 46
        //
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(8);
        q.enqueue(10);
        System.out.println(q.dequeue()); //2
        System.out.println(q.dequeue()); //4
        System.out.println(q.dequeue()); //6
        System.out.println(q.dequeue()); //8
        //10
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
        //10 11 12 13
        System.out.println(q.dequeue()); //10
        System.out.println(q.dequeue()); //11
        System.out.println(q.dequeue()); //12
        System.out.println(q.dequeue()); //13


        CircularQueue q2 = new CircularQueue(50);
        System.out.println(q2.isEmpty()); //true
        q2.enqueue(5); //5
        q2.enqueue(4); //5 4
        q2.enqueue(6); //5 4 6
        q2.enqueue(10); //5 4 6 10
        q2.enqueue(46); //5 4 6 10 46
        //q.enqueue(56); //full
        System.out.println(q2.dequeue()); //5
        // 4 6 10 46
        System.out.println(q2.dequeue()); //4
        // 6 10 46
        System.out.println(q2.dequeue()); // 6
        // 10 46
        System.out.println(q2.dequeue()); // 10
        // 46
        System.out.println(q2.dequeue()); // 46
        //
        q2.enqueue(2);
        q2.enqueue(4);
        q2.enqueue(6);
        q2.enqueue(8);
        q2.enqueue(10);
        System.out.println(q2.dequeue()); //2
        System.out.println(q2.dequeue()); //4
        System.out.println(q2.dequeue()); //6
        System.out.println(q2.dequeue()); //8
        //10
        q2.enqueue(11);
        q2.enqueue(12);
        q2.enqueue(13);
        //10 11 12 13
        System.out.println(q2.dequeue()); //10
        System.out.println(q2.dequeue()); //11
        System.out.println(q2.dequeue()); //12
        System.out.println(q2.dequeue()); //13
    }
}
