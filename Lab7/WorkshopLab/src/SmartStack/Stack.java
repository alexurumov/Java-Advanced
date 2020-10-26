package SmartStack;

import java.util.NoSuchElementException;

public class Stack {

    public static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int top;
    private int capacity;

    public Stack() {
        this.data = new int[INITIAL_CAPACITY];
        this.top = -1;
        this.capacity = INITIAL_CAPACITY;
    }

    public void push(int element) {

        if (this.top + 1 == this.capacity) {
            this.grow();
        }

        this.data[++this.top] = element;
    }

    public int pop() {

        if (this.top < 0) {
            throw new NoSuchElementException("Stack is empty");
        }

        int element = this.data[this.top];
        this.data[this.top--] = 0;

        return element;

    }

    public int peek() {

        if (this.top < 0) {
            throw new NoSuchElementException("Stack is empty");
        }

        return this.data[this.top];
    }

    private void grow() {
        this.capacity *= 2;
        int[] newData = new int[this.capacity];

        for (int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }
}
