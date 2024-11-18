package Assgn.first;
public class asgn25{
  public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Removed element is: " + stack.pop());
        System.out.println("Top element is: " + stack.peek());
    }
}
 class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor
    public ArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    // Push method to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Unable to push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    // Pop method to remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Unable to pop.");
            return -1; // Or throw an exception
        }
        return stackArray[top--];
    }

    // Peek method to view the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Unable to peek.");
            return -1; // Or throw an exception
        }
        return stackArray[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }


}

