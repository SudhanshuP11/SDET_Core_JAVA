package gettingStartedCollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array list");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements in the array list");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Elements which are not divisible by 3 are ");
        for (int i = list.size()-1; i>0; i--) {
            if(list.get(i)%3==0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
