package gettingStartedCollectionFrameWork.Set.HashSet;

import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        System.out.println(set.contains(1));
    }
}
