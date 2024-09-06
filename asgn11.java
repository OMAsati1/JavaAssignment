package Assgn;

import java.util.Scanner;

public class asgn11 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        int r=0;
        while (num>0){
            int ld = num%10;
            r=r*10+ld;
            num/=10;
        }
        System.out.print(r);
    }
}
