package gettingStartedCollectionFrameWork.LinkedList;

import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.removeLast();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
