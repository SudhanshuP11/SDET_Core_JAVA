package Inheritance;


interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

interface Walkable {
    void walk();
}

// Duck does ALL THREE!
class Duck implements Swimmable, Flyable, Walkable {
    @Override
    public void swim() { System.out.println("Duck is swimming"); }

    @Override
    public void fly() { System.out.println("Duck is flying"); }

    @Override
    public void walk() { System.out.println("Duck is walking"); }
}

class Fish implements Swimmable {
    @Override
    public void swim() { System.out.println("Fish is swimming"); }
}

class Bird implements Flyable, Walkable {
    @Override
    public void fly() { System.out.println("Bird is flying"); }

    @Override
    public void walk() { System.out.println("Bird is walking"); }
}

public class multipleinterfaceclass {
    public static void main(String[] args) {
        new Duck().swim();
        new Fish().swim();
        new Bird().fly();
    }
}
