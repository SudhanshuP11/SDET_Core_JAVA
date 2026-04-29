package Inheritance;


class A2{
    String name;
    A2(String name){
        this.name=name;
    }
    void makeSound(){
        System.out.println(name + " makes some sound");

    }
}
class B2 extends A2{
    B2(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println("B2 makes some sound");
    }
}
class C2 extends A2{
    C2(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println("C2 makes some sound");
    }
}
public class inh5 {
    public static void main(String[] args) {
        A2 a=new A2("a");
        B2 b=new B2("b");
        C2 c=new C2("c");
        a.makeSound();
        b.makeSound();
        c.makeSound();
    }
}
