package Assgn.second;

class Example3{
    int a;
    String s;

    public Example3(int a, String s) {
        this.a = a;
        this.s = s;
    }

    public Example3(int a) {
        this.a = a;
    }
}

public class asgn4 {
    public static void main(String[] args) {
    Example3 e=new Example3(23,"ramesh");
        System.out.println(e.a+" "+e.s);
    Example3 p=new Example3(29);
        System.out.println(p.a);
    }
}
