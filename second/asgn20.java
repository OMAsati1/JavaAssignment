package Assgn.second;

public class asgn20 {


    public static void main(String[] args) {
        // Example of NegativeArraySizeException
        try {
            int[] array = new int[-5]; // This will throw NegativeArraySizeException
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught a NegativeArraySizeException: " + e.getMessage());
        }

        // Example of ArithmeticException
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}


