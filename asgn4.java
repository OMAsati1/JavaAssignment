package Assgn;

import java.util.Scanner;

public class asgn4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Numbers before swap: "+ num1+" "+num2);
        swap(num1,num2);
    }
    static void swap(double a, double b){
        double temp=b;
        b=a;
        a=temp;
        System.out.println("Numbers after swap: "+ a+" "+b);
    }
}
