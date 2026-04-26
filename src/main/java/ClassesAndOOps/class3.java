package ClassesAndOOps;

import java.util.Scanner;

class Student {
    String name;
    int age;

    // Method 1: Calculate total (marks passed as parameter)
    int calculateTotal(int[] marks) {
        int total = 0;   // ✅ LOCAL variable — fresh every call
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    // Method 2: Calculate average (reuses calculateTotal)
    double calculateAverage(int[] marks) {
        return (double) calculateTotal(marks) / marks.length;
    }

    // Method 3: Find grade (reuses calculateAverage)
    String findGrade(int[] marks) {
        double avg = calculateAverage(marks);
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 60) return "C";
        else return "F";
    }
}

public class class3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int size = input.nextInt();
        int[] marks = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        // Create student object
        Student s1 = new Student();
        s1.name = "Jack";
        s1.age = 10;

        // Pass the marks array to each method
        System.out.println("\nName: " + s1.name);
        System.out.println("Total: " + s1.calculateTotal(marks));
        System.out.println("Average: " + s1.calculateAverage(marks));
        System.out.println("Grade: " + s1.findGrade(marks));
    }
}