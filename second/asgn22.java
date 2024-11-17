package Assgn.second;

// Custom exception class
class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class asgn22 {

    // Method to perform a simple calculation
    public static int calculate(int a, int b) throws CustomArithmeticException {
        if (b == 0) {
            throw new CustomArithmeticException("Division by zero is not allowed.");
        }
        if (a < 0 || b < 0) {
            throw new CustomArithmeticException("Negative numbers are not allowed in the calculation.");
        }

        // Equation: a / b
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            // Perform calculation
            int result = calculate(a, b);
            System.out.println("Result of calculation: " + result);

        } catch (CustomArithmeticException e) {
            System.out.println("Custom Arithmetic Exception Caught: " + e.getMessage());
        }
    }
}

