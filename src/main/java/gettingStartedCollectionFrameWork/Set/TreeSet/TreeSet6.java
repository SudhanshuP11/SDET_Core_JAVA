package gettingStartedCollectionFrameWork.Set.TreeSet;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSet6 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        set.add(72);
        set.add(85);
        set.add(60);
        set.add(95);
        set.add(78);
        set.add(88);
        int count =0;
        for(int x:set){
            if(count==3) break;
            System.out.println(x);

            count++;
        }
    }
}
