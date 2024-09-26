package Assgn.first;

import java.util.Scanner;

public class asgn16 {
    static int gcd(int a, int b){
         if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int x= scn.nextInt();
        int y= scn.nextInt();
        System.out.println("The hcf of "+x+" and "+y+" is "+gcd(x,y));
    }
}
