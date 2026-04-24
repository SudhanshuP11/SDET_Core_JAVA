package gettingStartedCollectionFrameWork.Set.TreeSet;

import java.util.TreeSet;

public class TreeSet4 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        treeSet.add(60);
        treeSet.add(70);
        treeSet.add(80);
        treeSet.add(90);
        System.out.println(treeSet.higher(50));
        System.out.println(treeSet.lower(50));
        System.out.println(treeSet.ceiling(50));
        System.out.println(treeSet.floor(50));
    }
}
