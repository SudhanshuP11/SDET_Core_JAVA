package gettingStartedCollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array list");
        int n = sc.nextInt();
        ArrayList<Integer> myArrayList = new ArrayList<>();
        System.out.println("Enter the elements in the array list");
        for (int i = 0; i < n; i++) {
            myArrayList.add(sc.nextInt());
        }
        System.out.println(myArrayList);
        System.out.println("No. of element greater than 50 are: ");
        int sum=0;
        for (int i = 0; i < myArrayList.size(); i++) {
            if(myArrayList.get(i)>50){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
