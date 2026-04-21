package gettingStartedCollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array list");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> name = new ArrayList<>();
        System.out.println("Enter the names in the array list");
        for (int i = 0; i < n; i++) {
            name.add(sc.nextLine());
        }

        for(String s: name){
            if(s.startsWith("A")){
                System.out.println(s);
            }
        }

    }
}
