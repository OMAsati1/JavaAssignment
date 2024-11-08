package Assgn.second;

class Example2{
    int a;
    String s;

    public Example2(int a, String s) {
        this.a = a;
        this.s = s;
    }
}

public class asgn3 {
    public static void main(String[] args) {
    Example2 e=new Example2(4,"kaliya");
        System.out.println(e.a+" "+e.s);
    }
}
