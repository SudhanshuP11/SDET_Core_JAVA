package gettingStartedCollectionFrameWork.LinkedList;

import java.util.LinkedList;

public class LinkedList6 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        String a = list.removeFirst();
        System.out.println(a);
        list.addLast("a");
        System.out.println(list);
        String b = list.removeLast();
        System.out.println(b);
        list.addFirst("a");
        System.out.println(list);
    }
}
