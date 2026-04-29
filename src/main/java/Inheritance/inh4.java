package Inheritance;

// method overloading
class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    String add(String a,String b){
        return a+b;
    }
}
public class inh4 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2,3));
        System.out.println(c.add(2.0,3.0));
        System.out.println(c.add("Sudhanshu ","Pathak"));
    }
}
