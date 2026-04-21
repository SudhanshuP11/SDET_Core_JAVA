package gettingStartedCollectionFrameWork.ArrayList;

import java.util.ArrayList;

public class ArrayList11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(3);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(list.get(0));   // add first element

        // Loop through REST of the original list
        for (int i = 1; i < list.size(); i++) {   // ✅ use list.size()
            if (!list1.contains(list.get(i))) {   // ✅ check with contains()
                list1.add(list.get(i));           // ✅ add from original list
            }
            // if contains, do nothing (automatically skips)
        }

        System.out.println("Original: " + list);
        System.out.println("Unique:   " + list1);
    }
}