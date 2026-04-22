package gettingStartedCollectionFrameWork.LinkedList;

import java.util.LinkedList;

public class LinkedList7 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        int start =0;
        int end=list.size()-1;
        boolean ispanlindrome=true;
        while(start<end){
            if(!list.get(start).equals(list.get(end))){
                ispanlindrome=false;
            }
            start++;
            end--;
        }
        System.out.println(ispanlindrome);
    }
}
