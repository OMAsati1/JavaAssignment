package Assgn.first;

class Commission {
   private final float sales;
    Commission(float sales){
      this.sales=sales;
    }
    void commission(){
         if(sales<=0){
            System.out.println("Invalid input");
            return;
        }
        System.out.println("The commission for sales: "+sales+" is ");

        float c=(sales*5)/100;
        System.out.println(c);
    }
}
public class asgn33{
    public static void main(String[] args) {
        Commission com=new Commission(65000);
        com.commission();

    }
}

