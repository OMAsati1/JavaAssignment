package Assgn.second;
    import java.util.Scanner;

    class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class asgn24 {


    public static void checkage(double age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("You are too older");
        } else if (age < 20) {
            throw new TooYounger("You are too older");
        } else {
            System.out.println("“Eligible”");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Age:");

        try {
            double age = scanner.nextDouble();
            checkage(age);

        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        }
    }
}


