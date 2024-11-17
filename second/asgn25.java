package Assgn.second;

import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}


public class asgn25 {

    public static void validateCredentials(String username, String password, String confirmPassword)
            throws InvalidUsernameException, PasswordMismatchException {
        if (username.length() < 6) throw new InvalidUsernameException("Username must be at least 6 characters long");
        if (!password.equals(confirmPassword)) throw new PasswordMismatchException("Passwords do not match");
        System.out.println("Username and password are valid!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        System.out.println("Confirm password:");
        String confirmPassword = scanner.nextLine();

        try {
            validateCredentials(username, password, confirmPassword);
        } catch (InvalidUsernameException | PasswordMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}

