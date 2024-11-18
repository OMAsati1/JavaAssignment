package Assgn.first;

class ArrayQueue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    // Constructor
    public ArrayQueue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    // Enqueue method to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Unable to enqueue " + value);
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = value;
        nItems++;
    }

    // Dequeue method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Unable to dequeue.");
            return -1; // Or throw an exception
        }
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    // Peek method to view the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Unable to peek.");
            return -1; // Or throw an exception
        }
        return queueArray[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return nItems == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return nItems == maxSize;
    }

}


public class asgn26 {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element is: " + queue.peek());
        System.out.println("Removed element is: " + queue.dequeue());
        System.out.println("Front element is: " + queue.peek());
    }
}
