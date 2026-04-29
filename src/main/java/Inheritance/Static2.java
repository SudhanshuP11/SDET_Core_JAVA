package Inheritance;

class Employee1 {
    String name;
    int id;
    static int totalEmployees = 0;   // counter shared by all

    Employee1(String name) {
        this.name = name;
        totalEmployees++;             // increment for each new object
        this.id = totalEmployees;     // assign ID based on count
    }
}

public class Static2 {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Alice");
        Employee1 e2 = new Employee1("Bob");
        Employee1 e3 = new Employee1("Charlie");

        System.out.println(e1.name + " has ID: " + e1.id);
        System.out.println(e2.name + " has ID: " + e2.id);
        System.out.println(e3.name + " has ID: " + e3.id);

        System.out.println("Total employees: " + Employee1.totalEmployees);
    }
}