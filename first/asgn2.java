package Assgn.first;

import java.util.Scanner;

public class asgn2 {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter any number: ");
        int x=inp.nextInt();
        if (x<0){
            System.out.println("It is a negative value.");
        }
        else if (x>0){
            System.out.println("It is a positive value.");

        }
        else{
            System.out.println("It is zero.");
        }
    }
}
