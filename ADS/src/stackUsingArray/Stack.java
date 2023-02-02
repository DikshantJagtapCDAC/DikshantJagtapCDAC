package stackUsingArray;

public class Stack {

    //instance variables
    private int[] items; //hold the data
    private int top; //index to keep track of the topmost element;
    private int capacity;

    public Stack(int capacity) {
        this.items = new int[capacity];
        this.capacity = capacity;
        this.top = -1; //index to keep track of the topmost element;
    }

    public boolean isEmpty() {
        return top < 0;
    }

	private boolean isFull() {
		return top == items.length - 1;
	}

    public void push(int item) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
            //System.out.println("Stack is full");
        }
        items[++top] = item;
    }

	/**
     * Returns the topmost item and removes it
     *
     * @return
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
            //System.out.println("Stack is empty");
        }
        return items[top--];
    }

    /**
     * Returns the topmost item without removing it
     * Peek and Pop methods should ideally be invoked after checking that the stack is not empty
     * either in a 'if' condition or a 'while' loop
     *
     * @return
     */
    public int peek() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return items[top];
    }
}
