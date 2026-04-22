package gettingStartedCollectionFrameWork.LinkedList;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println("LinkedList first element: " + list.getFirst());
        System.out.println("LinkedList last element: " + list.getLast());
        list.addFirst("g");
        list.addLast("h");
        System.out.println("LinkedList: " + list);
        System.out.println("LinkedList first element: " + list.getFirst());
        System.out.println("LinkedList last element: " + list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println("LinkedList: " + list);
        String firstPeek = list.peek();          // store the returned value
        String firstPeekF = list.peekFirst();    // same as peek()
        String lastPeek = list.peekLast();       // get last element

        System.out.println("peek(): " + firstPeek);
        System.out.println("peekFirst(): " + firstPeekF);
        System.out.println("peekLast(): " + lastPeek);
    }
}
