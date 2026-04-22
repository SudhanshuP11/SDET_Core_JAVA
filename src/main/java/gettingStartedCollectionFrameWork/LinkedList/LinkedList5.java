package gettingStartedCollectionFrameWork.LinkedList;

import java.util.LinkedList;

public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(20);
        list.add(22);
        list.add(50);
        list.add(30);
        int count =0;
        for (int i=0;i<list.size()-1;i++){
            if(Math.abs(list.get(i+1)-list.get(i))>10){
                count++;
            }
        }
        System.out.println(count);
    }
}
