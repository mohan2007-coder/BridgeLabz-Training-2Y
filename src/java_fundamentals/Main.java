package java_fundamentals;

public class Main{
    public static int Addition(int a,int b){
        int c= a+b;
        return c;
    }
    public static void main(String args[]){
        int a=5;
        int b=12;
        int sum=Addition(a,b);
        System.out.println(sum);
    }
}