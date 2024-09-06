package Assgn;

import java.util.Scanner;

public class asgn19 {
    public static void main(String[] args) {
         Scanner scn= new Scanner(System.in);
        System.out.print("enter a number ");
        String x= scn.next();
        x=x.toLowerCase();
        int s=0;
        int e=x.length()-1;
        while (s<e){
            if (x.charAt(s)==x.charAt(e)){
                s++;
                e--;
            }
            else{
        System.out.println("entered String is not a palindrome.");
              return;
            }
        }
        System.out.println("entered String is a palindrome.");
    }
}
