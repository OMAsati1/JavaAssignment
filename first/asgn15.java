package Assgn.first;

import java.util.Scanner;

public class asgn15 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("enter number for its multiples");
        int x= scn.nextInt();
        System.out.println("enter range");
        int y= scn.nextInt();
        int t=1;
        System.out.println("Table of "+x+" from 1 to "+y);
        for (int i = 1; i <=y ; i++) {
            System.out.print((x*i)+" ");
        }
    }
}
