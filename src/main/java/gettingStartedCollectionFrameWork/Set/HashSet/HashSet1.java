package gettingStartedCollectionFrameWork.Set.HashSet;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Hello");
        set.add("World");
        set.add("HelloJI");
        System.out.println(set);
        set.remove("World");
        System.out.println(set);
    }
}
