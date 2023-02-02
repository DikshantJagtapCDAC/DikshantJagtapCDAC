package circularQueueUsingArray;

/**
 * This is an implementation of the Circular Queue
 */
public class CircularQueue {

	//instance variables
	private int[] items;
	private int front;
	private int rear;
	private int numOfItems; // this field makes the implementation easy
	
	public CircularQueue(int size) {
		this.items = new int[size];
		front = -1;
		rear = -1;
		numOfItems = 0;
	}
	//ADT operations
	public void enqueue(int item) {
		if (isFull()) {
			throw new RuntimeException("Queue is full");
			//System.out.println("Queue is full");
		}
		if (rear == items.length-1) // deal with circular case
			rear = -1;
		items[++rear] = item;

		numOfItems++; // add 1 to the item count
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty");
			//System.out.println("Queue is empty");
		}
		if (front == items.length-1)
			front = -1;
		numOfItems--;
		return items[++front];
	}

	public int peek() {
		return items[front +1];
	}
	
	public boolean isFull() {
		return numOfItems == items.length;
	}

	public boolean isEmpty() {
		return numOfItems == 0;
	}
	

}
