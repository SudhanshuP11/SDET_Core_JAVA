package gettingStartedCollectionFrameWork.Set.TreeSet;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSet7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(12);
        list.add(78);
        list.add(12);
        list.add(90);
        System.out.println(list);
        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.println(set);
    }
}
