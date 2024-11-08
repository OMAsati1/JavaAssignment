package Assgn.second;

public class asgn17 {
    public static void main(String[] args) {
        int a=2415;
        int s=0;
        while(a!=0){
            int r=a%100;
            if(r>9) s+=r;
         a/=10;
        }
        System.out.println(s);
    }
}
