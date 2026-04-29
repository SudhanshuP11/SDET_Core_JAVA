package Inheritance;

interface A4{
    void eat();
    void sleep();      // implicitly public abstract
    void makeSound();
}
class B4 implements A4{
    @Override
    public void eat() {
        System.out.println("B4 is eating");
    }
    @Override
    public void sleep() {
        System.out.println("B4 is sleeping");
    }
    @Override
    public void makeSound() {
        System.out.println("B4 is making sound");
    }
}

public class interfaceclass {
    public static void main(String[] args) {
        B4 b = new B4();
        b.eat();
        b.sleep();
        b.makeSound();
    }
}
