package Assgn;

public class asgn23 {
    // pattern (a)
  /*  public static void main(String[] args) {
        int n=1;
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print(n+" ");
            n++;
            }

            System.out.println();
        }
    } */
    // pattern (b)
    public static void main(String[] args) {

        for (int i = 1; i <=4 ; i++) {
            for (int j = 4-i; j >=0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >0; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
