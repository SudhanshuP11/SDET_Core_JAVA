package Inheritance;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int teamSize) {
        super(name);
        this.teamSize = teamSize;
    }

    @Override
    void displayInfo() {
        super.displayInfo();   // ✅ run parent's version first
        System.out.println("Team size: " + teamSize);   // then add own
    }
}

public class inh6 {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 5);
        m.displayInfo();
    }
}