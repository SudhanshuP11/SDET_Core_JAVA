package Inheritance;


class Animal {
    String type ="Animal";
    void identify() {
        System.out.println("I am an "+type);
    }
}
class Dog extends Animal {
    String type ="Dog";
    void showBoth() {
        System.out.println("I am an "+this.type);
        System.out.println("I am "+super.type);
    }
}
public class superinh {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.showBoth();
    }
}
