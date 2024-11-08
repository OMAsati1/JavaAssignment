package Assgn.second;

class A{
    void display(){
        System.out.println("Hello");
    }
}
class B extends A{
    @Override
    void display() {
        System.out.println("Hi");
    }
}

public class asgn7 {
    public static void main(String[] args) {
        A a=new A();
        a.display();
        B b=new B();
        b.display();
    }
}
