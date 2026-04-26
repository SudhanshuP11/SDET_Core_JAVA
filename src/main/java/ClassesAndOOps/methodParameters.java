package ClassesAndOOps;
class Greeting {
    String userName;

    // Method with parameter
    void greet(String message) {
        System.out.println(message + ", " + userName + "!");
    }

    // Method with multiple parameters
    int addNumbers(int a, int b) {
        return a + b;
    }
}

public class methodParameters {
    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.userName = "Rohit";

        g.greet("Hello");           // Hello, Rohit!
        g.greet("Welcome");         // Welcome, Rohit!

        int result = g.addNumbers(10, 20);
        System.out.println("Sum: " + result);   // Sum: 30
    }
}