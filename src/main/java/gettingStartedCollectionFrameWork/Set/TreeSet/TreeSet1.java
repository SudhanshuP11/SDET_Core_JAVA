package gettingStartedCollectionFrameWork.Set.TreeSet;


import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(30);

        System.out.println(numbers);

        TreeSet<String> names = new TreeSet<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");
        names.add("David");

        System.out.println(names);
    }
}