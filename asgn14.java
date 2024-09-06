package Assgn;

import java.util.Scanner;

public class asgn14 {
    public static void main(String[] args) {

         Scanner inp=new Scanner(System.in);
        int num1=inp.nextInt();
        int num2=inp.nextInt();
        for (int i = num1; i <num2; i++) {
            if (i%10==0) {
                System.out.println(i+" is multiple of 10 between "+num1+" and "+num2);
            }
        }
    }
}
