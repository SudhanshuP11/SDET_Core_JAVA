package gettingStartedCollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the size of the array list: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array list: ");
        for(int i=0; i<size;i++){
            list.add(sc.nextInt());
        }
        int sum=0;
        for(int num:list){
            sum+=num;
        }
        System.out.println("Total: " +sum);
    }
}
