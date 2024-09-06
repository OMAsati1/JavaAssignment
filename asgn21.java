package Assgn;

import java.util.Scanner;

public class asgn21 {
    // Binary to Decimal
   /* public static void main(String[] args) {
        System.out.print("Enter a binary number : ");
         Scanner scn= new Scanner(System.in);
        int x= scn.nextInt();
         int temp = x ;
         int ans = 0 ;
         int mul = 1 ;

    while(temp>0){
        if(temp%10 != 0 && temp% 10 != 1 ){
            System.out.println("enter a valid number");
            return;
        }
        temp/=10;
    }
        while(x!=0){
            int ld=x%10;
            ans+=ld*mul;
            mul*=2;
            x/=10;
        }
        System.out.println("its decimal form is : "+ans);

    } */


    // Decimal to Binary
    public static void main(String[] args) {
        System.out.print("Enter a decimal number : ");
         Scanner scn= new Scanner(System.in);
        int x= scn.nextInt();
         int temp = x ;
         int ans = 0 ;
         int mul = 1 ;

        while(x!=0){
            int ld=x%2;
            ans+=ld*mul;
            mul*=10;
            x/=2;
        }
        System.out.print("its binary form is : "+ans);

    }
}
