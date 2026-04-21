package gettingStartedCollectionFrameWork.ArrayList;

import java.util.ArrayList;

public class ArrayList12 {
    public static void main(String[] args) {
        // Step 1: Create the list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);

        // Step 2: Set up two pointers
        int start = 0;
        int end = list.size() - 1;

        // Step 3: Swap until pointers meet
        while (start < end) {
            // Swap using temp variable
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            // Move pointers toward center
            start++;
            end--;
        }

        // Step 4: Print the reversed list
        System.out.println("Reversed list: " + list);
    }
}