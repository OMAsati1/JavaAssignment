package Assgn.second;

class C{
    static void display(){
        System.out.println("Hello");
    }
}
class D extends C{
//    this is method hiding
    static void display() {
        System.out.println("Hi");
    }
}

public class asgn8 {
    public static void main(String[] args) {
       C c=new D();

       c.display();

    }
}
