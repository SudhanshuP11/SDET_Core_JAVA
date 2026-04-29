package ClassesAndOOps;

import java.util.Scanner;

class c1{
    String title;
    String author;
    double price;
    c1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class constructordemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the title: ");
        String title = input.nextLine();
        System.out.println("Enter the author: ");
        String author = input.nextLine();
        System.out.println("Enter the price: ");
        double price = input.nextDouble();

        c1 c1 = new c1(title, author, price);
        c1.displayInfo();
    }
}
