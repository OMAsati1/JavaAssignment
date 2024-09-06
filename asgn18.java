package Assgn;

import java.util.Scanner;

public class asgn18 {
    public static void main(String[] args) {
         Scanner scn= new Scanner(System.in);
        System.out.print("enter a number");
        int x= scn.nextInt();
        int a=x;
        int cnt=0;
        while (x!=0){
            x/=10;
            cnt++;
        }
        System.out.print("Number of digit in "+a+" is "+cnt);
    }
}
