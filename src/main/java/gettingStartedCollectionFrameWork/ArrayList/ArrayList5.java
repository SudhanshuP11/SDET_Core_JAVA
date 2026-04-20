package gettingStartedCollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList5 {
    // print even
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the no. of elements in the list");
        int n = sc.nextInt();
        System.out.println("Enter elements in the list");
        for (int i = 1; i <= n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        System.out.println("even no in list");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2!=0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);


    }

    // or use backword loop
//    for (int i = list.size() - 1; i >= 0; i--) {
//        if (list.get(i) % 2 != 0) {
//            list.remove(i);
//        }
//    }
}
