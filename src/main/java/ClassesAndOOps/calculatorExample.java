package ClassesAndOOps;
//methods that return the value
class Calculator {
    int num1;
    int num2;

    int add() {
        return num1 + num2;
    }

    int subtract() {
        return num1 - num2;
    }

    int multiply() {
        return num1 * num2;
    }

    double divide() {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double) num1 / num2;
    }
}

public class calculatorExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.num1 = 10;
        calc.num2 = 3;

        System.out.println("Sum: " + calc.add());
        System.out.println("Diff: " + calc.subtract());
        System.out.println("Product: " + calc.multiply());
        System.out.println("Quotient: " + calc.divide());
    }
}