package Assgn.first;

import java.util.Scanner;

public class asgn8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("set divisor");
        double d=sc.nextDouble();
        System.out.println("give any number");
        double c=sc.nextDouble();
        if (c % d==0) {
            System.out.println("given number is divisible by set divisor");
        }
        else {
            System.out.println("given number is not divisible by set divisor");

        }
    }
}
