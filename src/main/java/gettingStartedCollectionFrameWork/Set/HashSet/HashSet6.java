package gettingStartedCollectionFrameWork.Set.HashSet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSet6 {

    // Method to check if list has duplicates
    public static boolean hasDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : list) {
            // If add() returns false, it means num is already in the set
            if (!seen.add(num)) {
                return true;   // duplicate found → exit immediately
            }
        }

        return false;   // no duplicates found
    }

    public static void main(String[] args) {
        // Test case 1: No duplicates
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("List1: " + list1);
        System.out.println("Has duplicates? " + hasDuplicates(list1));

        System.out.println();   // blank line for readability

        // Test case 2: Has duplicates
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 5));
        System.out.println("List2: " + list2);
        System.out.println("Has duplicates? " + hasDuplicates(list2));
    }
}