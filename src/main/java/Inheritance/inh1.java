package Inheritance;


class Animal1{
    String name;
    int age;
    void eat(){
        System.out.println(name+" is eating");
    }
    void sleep(){
        System.out.println(name+" is sleeping");
    }
}
class Dog1 extends Animal1{
    void bark(){
        System.out.println(name+" is barking");
    }
}
public class inh1 {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        d1.name = "Bob";
        d1.age = 100;
        d1.eat();
        d1.sleep();
        d1.bark();
    }
}
