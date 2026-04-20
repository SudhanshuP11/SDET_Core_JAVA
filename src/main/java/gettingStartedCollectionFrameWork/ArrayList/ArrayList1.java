package gettingStartedCollectionFrameWork.ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Sudhanshu");
        list.add("Pathak");

        list.remove(2);
        System.out.println(list);
    }
}
