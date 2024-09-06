package Assgn;

import java.util.Scanner;

public class asgn24 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scn.nextInt();
        int sum=0;
        int []arr=new int[n];
        System.out.println("Enter entities of array");
        for (int i = 0; i < n; i++) {
             arr[i]=scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
          sum+=arr[i];
        }
        System.out.println("sum is "+sum);
        System.out.println("average is "+sum/n);
    }
}
