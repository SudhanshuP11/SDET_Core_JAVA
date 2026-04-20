package gettingStartedCollectionFrameWork.ArrayList;

import java.util.ArrayList;

public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("D");
        list1.add("E");
        list1.add("F");
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.addAll(list);
        System.out.println(list2);

    }
}
