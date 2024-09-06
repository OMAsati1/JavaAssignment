package Assgn;

import java.util.Scanner;

public class asgn5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter distance in Miles: ");
        double x=sc.nextDouble();
        System.out.println("Distance in Kilometer: "+1.609344*x);
    }
}
