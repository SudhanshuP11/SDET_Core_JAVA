package gettingStartedCollectionFrameWork.ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("E Exist :"+list.contains("E"));
    }
}
