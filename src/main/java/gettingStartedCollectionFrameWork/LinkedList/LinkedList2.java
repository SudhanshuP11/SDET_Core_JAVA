package gettingStartedCollectionFrameWork.LinkedList;

import javax.sound.midi.SysexMessage;
import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.offer(1);
        list.offer(2);
        list.offer(3);
        list.offer(4);
        list.offer(5);
        int size = list.size();
//        for( int i = 0; i <size; i++ ) {
//            int removed = list.poll();
//            System.out.print("Removed item: " +removed);
//            System.out.println(list);
//        }
        System.out.println("Using while loop");
        while(!list.isEmpty()) {
            int removed = list.poll();
            System.out.println("Removed: " + removed);
            System.out.println("Remaining: " + list);
        }
    }
}
