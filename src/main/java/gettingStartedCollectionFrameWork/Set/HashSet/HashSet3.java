package gettingStartedCollectionFrameWork.Set.HashSet;

import java.util.HashSet;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(7);
        HashSet<Integer> set2 = new HashSet<>();
        set2.addAll(set);
//        set2.addAll(set1);

//        set2.retainAll(set);
        set2.retainAll(set1);
        System.out.println(set2);
    }
}
