package Assgn.second;

import java.util.Arrays;

public class asgn1 {
    public static void main(String[] args) {
        int [] a={1,5,7,8,9,24};
        int [] b={3,4,10,11,12};
        int i=0,j=0,k=0,n=a.length+b.length;
        int[] c=new int[n];
          while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i<a.length) {
            c[k++] = a[i++];
        }
        while (j<b.length){
             c[k++]=b[j++];
        }
        System.out.println(Arrays.toString(c));
    }
}
