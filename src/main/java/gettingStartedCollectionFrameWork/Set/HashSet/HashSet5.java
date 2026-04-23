package gettingStartedCollectionFrameWork.Set.HashSet;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;

public class HashSet5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String please: ");
        String str = input.nextLine();
        String[] str1 = str.split(" ");
        HashSet<String> set1 = new HashSet<>();
        for(String word : str1) {
            set1.add(word);
        }
        System.out.println(set1);

    }
}
