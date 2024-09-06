package Assgn;

import java.util.Scanner;

public class asgn13 {
    public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        int sum=0;
        for (int i = 1; i <=num ; i++) {
            sum+=i;
        }
            System.out.println("Sum of n natural number is: "+sum);
    }
}
