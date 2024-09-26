package Assgn.first;

import java.util.Scanner;

public class asgn10 {
    static int fib(int n){
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        return n+fib(n-1);
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.print(fib(i)+" ");
        }
    }
}
