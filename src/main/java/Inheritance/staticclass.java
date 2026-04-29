package Inheritance;


class A5{
    String name;
    static String school = "Greenwood High";   // shared by all students

    A5(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println(name + " studies at " + school);
    }
}
public class staticclass {
    public static void main(String[] args) {
        {
            A5 a5 = new A5("Bob");
            A5 a52 = new A5("Bob2");
            A5 a53 = new A5("Bob3");
            a5.displayInfo();
            a52.displayInfo();
            a53.displayInfo();
            System.out.println("School name "+A5.school);
        }
    }
}
