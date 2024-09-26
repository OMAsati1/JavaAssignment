package Assgn.first;

import java.util.Scanner;

public class asgn3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        // Find the maximum
        double max = Math.max(Math.max(num1, num2), num3);

        System.out.println("The maximum of the three numbers is: " + max);

        scanner.close();
    }
}

