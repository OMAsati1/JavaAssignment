package Assgn;
public class asgn12 {
    public static void main(String[] args) {
        Marks m=new Marks(15,18,82);
        m.evaluate();
    }
}
 class Marks{
    float mathsMarks;
    float physicsMarks;
    float chemistryMarks;
    Marks(float a,float b,float c){
         mathsMarks=a;
         physicsMarks=b;
         chemistryMarks=c;
    }
    void evaluate(){
        float total= mathsMarks+physicsMarks+chemistryMarks;
        System.out.println("Total marks is "+total);
        if (mathsMarks<60){
            System.out.println("Reject because you failed in maths and Now its doesn't" +
                    " matter your total is greater than 200");

        }
        if (physicsMarks<50){
            System.out.println("Reject because you failed in physics and Now its doesn't" +
                    " matter your total is greater than 200");

        }
        if (chemistryMarks<40){
            System.out.println("Reject because you failed in chemistry and Now its doesn't" +
                    " matter your total is greater than 200");
        }
        if(total<200){
            System.out.println("Overall you are Rejected");
            return;
        }
        else{
            System.out.println("Passed");
        }
    }
}
