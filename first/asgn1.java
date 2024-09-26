package Assgn.first;

import java.util.Scanner;
 public class asgn1{
public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    float C= sc.nextFloat();
    System.out.print("Temperature for given value "+C+" which is in °C will "+((9/5)*C+32)+" in °F");
    }
}
