package Inheritance;


abstract class A3{
    String name;

    A3(String name){
        this.name = name;
    }
    void sleep() {
        System.out.println(name + " is sleeping");
    }

    // Abstract method — every child MUST implement
    abstract void makeSound();
}
class B3 extends A3{
    B3(String name){
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + " is making sound");
    }
}
class C3 extends A3{
    C3(String name){
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + " is making sound");
    }
}
public class absclass {
    public static void main(String[] args) {
        B3 b = new B3("Bob");
        C3 c = new C3("Carl");
        b.sleep();
        b.makeSound();
        c.sleep();
        c.makeSound();
    }
}
