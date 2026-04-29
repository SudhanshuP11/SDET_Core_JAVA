package Inheritance;

class A1{
    String name;
    A1(String name){
        this.name=name;
        System.out.println("A1 constructor ran");
    }
    void aB(){
        System.out.println("Hello my name is SUdhanshu");
    }
}
class B1 extends A1{
    String breed;
    B1(String name,String breed){

        super(name);
        this.breed=breed;
        System.out.println("B1 constructor ran");
        super.aB();
    }

}
public class inh2 {
    public static void main(String[] args) {
        B1 b = new B1("Bob","Buddy");
        System.out.println(b.name+" is a "+b.breed);
    }
}
