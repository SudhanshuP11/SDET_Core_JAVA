package gettingStartedCollectionFrameWork.ArrayList;

import java.util.ArrayList;

public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int n = list.get(0);
        for (int a : list) {
            if (a > n) {
                n = a;
            }
        }
        System.out.println(n);
    }
}
