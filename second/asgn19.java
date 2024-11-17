package Assgn.second;

public class asgn19 {

    // Method demonstrating the use of throws keyword
    public static void methodThatThrowsException() throws Exception {
        throw new Exception("This is a thrown exception");
    }

    public static void main(String[] args) {
        try {
            int division = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }


    }
}

