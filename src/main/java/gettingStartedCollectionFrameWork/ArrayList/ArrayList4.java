package gettingStartedCollectionFrameWork.ArrayList;

import java.util.ArrayList;

public class ArrayList4 {
    // replace value
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        list.set(0, "E");
        System.out.println("After: "+list);
    }
}
