package Assgn.second;

public class asgn6 {

     static float avg(float a, float b, float c){
    return (a+b+c)/3;
}
// overload avg
static float avg(float a, float b, float c, float d){
    return (a+b+c+d)/3;
}

    public static void main(String[] args) {
        System.out.println(avg(5,7,9));
        System.out.println(avg(23,67,45,89));
    }
}
