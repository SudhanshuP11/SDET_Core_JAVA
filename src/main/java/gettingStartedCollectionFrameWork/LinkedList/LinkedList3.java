package gettingStartedCollectionFrameWork.LinkedList;

import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.push("a");
        list.push("b");
        list.push("c");
        list.push("d");
        list.push("e");
        System.out.println(list);
        int size = list.size();
        for(int i =0; i<size; i++){
            String a=list.pop();
            System.out.println(a);
            System.out.println(list);
        }
    }
}
