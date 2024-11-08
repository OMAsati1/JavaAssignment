package Assgn.second;

class IT{
    String s;
    int a;

    public IT(String s, int a) {
        this.s = s;
        this.a = a;
    }
    void display(){
        System.out.println(s+" "+a);
    }
}

public class asgn15 {
    public static void main(String[] args) {
        IT b=new IT("Branch",34);
        b.display();
    }
}
