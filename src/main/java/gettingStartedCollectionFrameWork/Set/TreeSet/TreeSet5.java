package gettingStartedCollectionFrameWork.Set.TreeSet;

import java.util.TreeSet;

public class TreeSet5 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(15);
        treeSet.add(25);
        treeSet.add(35);
        treeSet.add(45);
        treeSet.add(55);
        treeSet.add(65);
        treeSet.add(75);
        System.out.println(treeSet.headSet(45));
        System.out.println(treeSet.tailSet(45));
        System.out.println(treeSet.subSet(25,55));
    }
}
