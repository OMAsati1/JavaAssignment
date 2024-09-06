package Assgn;

public class asgn9 {
    static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("factorial of 12 is: "+fact(12));
    }
}
