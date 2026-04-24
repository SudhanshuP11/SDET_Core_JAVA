package gettingStartedCollectionFrameWork.Set.TreeSet;

import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("B");
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
    }
}
