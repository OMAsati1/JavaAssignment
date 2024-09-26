package Assgn.first;
class B{
    B(int a){
        System.out.println("This is parameterized constructor. "+a);
    }
}
public class asgn32 {
    public static void main(String[] args) {
        B b= new B(4);
    }
}
