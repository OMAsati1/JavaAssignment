package Assgn;

import java.util.Scanner;

public class asgn20 {
      public static boolean isPrime(int num) {
        if (num < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // If no divisors were found, it's prime
    }
    public static void main(String[] args) {
      Scanner scn= new Scanner(System.in);
        System.out.print("enter a number ");
        int x= scn.nextInt();

         System.out.println("Prime numbers up to " + x + ":");

        // Loop through all numbers from 2 to x
        for (int num = 2; num <= x; num++) {
            if (isPrime(num)) {
                System.out.print(num+" "); // Print the number if it's prime
            }
        }
    }
}
