package ClassesAndOOps;

class A{
    double length;
    double width;
    double area(){
        return length*width;
    }
    double parameter(){
        return 2*(length*width);
    }
}
public class Area {
    public static void main(String[] args) {
        A a = new A();
        a.length=10;
        a.width=10;
        System.out.println(a.area());
        System.out.println(a.parameter());
    }
}
