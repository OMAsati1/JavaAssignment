package Assgn.second;

class ITT{
    static String s;
    static int a;

    public ITT(String s, int a) {
        this.s = s;
        this.a = a;
    }
   static void display(){
        System.out.println(s+" "+a);
    }
}

public class asgn16 {
    public static void main(String[] args) {
        ITT b=new ITT("Branch",34);
        ITT.display();// dont need object to acess directly reference to class
    }
}
