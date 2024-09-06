package Assgn;

class Commmission {
   private float sales;
    Commmission(float sales){
      this.sales=sales;
    }
    void commission(){
         if(sales<=0){
            System.out.println("Invalid input");
            return;
        }
        System.out.println("The commmission for sales: "+sales+" is ");

        float c=(sales*5)/100;
        System.out.println(c);
    }
}
public class asgn33{
    public static void main(String[] args) {
        Commmission com=new Commmission(65000);
        com.commission();

    }
}

