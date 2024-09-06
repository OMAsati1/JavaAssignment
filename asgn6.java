package Assgn;

import java.util.Scanner;

public class asgn6 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int x= inp.nextInt();
        if((x%4==0 && x%100!=0) || (x%400)==0){
            System.out.println("It is a leap year.");
        }
        else{
            System.out.println("It is a not leap year.");

        }
    }
}
