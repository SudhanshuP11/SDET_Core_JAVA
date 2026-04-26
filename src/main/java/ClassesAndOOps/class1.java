package ClassesAndOOps;

class class10 {
    String name;
    int age;
    int rollNumber;
    double marks;
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
    void study(){
        System.out.println("Study is called");
    }
}
public class class1{
    public static void main(String[] args) {
        class10 obj = new  class10();
        obj.name="Akira";
        obj.age=10;
        obj.rollNumber=100;
        obj.marks=100;
        obj.displayInfo();
        obj.study();

    }
}
