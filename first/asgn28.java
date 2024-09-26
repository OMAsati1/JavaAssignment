package Assgn.first;

import java.util.Scanner;

public class asgn28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scn.nextInt();
        int s = 0;
        int[] arr = new int[n];
        System.out.println("Enter entities of array");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if ((arr[i] & 1) == 1) {
                s += arr[i];
            }
        }
        System.out.println("The sum of odd numbers in array is: "+s);

    }
}