package Assgn.second;
    import java.util.Scanner;

   class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}


public class asgn26 {


    public static void checkAge(String name, int age) throws NegativeAgeException{
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative for " + name);
        } else {
            System.out.println(name + " is " + age + " years old.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter name:");
       String name = scanner.nextLine();
       System.out.println("Enter age:");
       int age = scanner.nextInt();

        try {

            checkAge(name,age);

        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}


