package ClassesAndOOps;

import java.util.ArrayList;

class Employee {
    // Fields
    String name;
    int id;
    double salary;

    // Method to display employee details
    void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class class4 {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList to hold Employee objects
        ArrayList<Employee> employees = new ArrayList<>();

        // Step 2: Create 5 employees and add them to the list
        Employee e1 = new Employee();
        e1.name = "Alice";
        e1.id = 101;
        e1.salary = 55000;
        employees.add(e1);

        Employee e2 = new Employee();
        e2.name = "Bob";
        e2.id = 102;
        e2.salary = 72000;
        employees.add(e2);

        Employee e3 = new Employee();
        e3.name = "Charlie";
        e3.id = 103;
        e3.salary = 48000;
        employees.add(e3);

        Employee e4 = new Employee();
        e4.name = "Diana";
        e4.id = 104;
        e4.salary = 90000;
        employees.add(e4);

        Employee e5 = new Employee();
        e5.name = "Eve";
        e5.id = 105;
        e5.salary = 65000;
        employees.add(e5);

        // Step 3: Iterate through the list and print each employee's details
        System.out.println("All Employees:");
        for (Employee emp : employees) {
            emp.displayInfo();
        }

        // Step 4: Find employee with the highest salary
        Employee topEarner = employees.get(0);   // start with first employee

        for (Employee emp : employees) {
            if (emp.salary > topEarner.salary) {
                topEarner = emp;   // update reference to the new top earner
            }
        }

        // Step 5: Print the top earner
        System.out.println("\nTop earner:");
        topEarner.displayInfo();
    }
}