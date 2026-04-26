package ClassesAndOOps;


class Mobile{
    String brand;
    String model;
    String ram;
    double price;
    void displayInfo(){
        System.out.println("Brand is: "+brand);
        System.out.println("Model is: "+model);
        System.out.println("Ram is: "+ram);
        System.out.println("Price is: "+price);
    }
}
public class class2 {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.brand = "Samsung";
        m.model="S26";
        m.ram="12Gb";
        m.price=50000;
        m.displayInfo();
        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.model="S25";
        m2.ram="12Gb";
        m2.price=40000;
        m2.displayInfo();

    }
}
