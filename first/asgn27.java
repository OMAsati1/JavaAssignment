package Assgn.first;

import java.util.Scanner;

public class asgn27 {
    public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scn.nextInt();
        int mini=Integer.MAX_VALUE;
        int []arr=new int[n];
         for (int i = 0; i < n; i++) {
             arr[i]=scn.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            if (arr[i]<mini)
                mini=arr[i];
        }
        System.out.println("Minimum number in above array is: "+mini);
    }
}
