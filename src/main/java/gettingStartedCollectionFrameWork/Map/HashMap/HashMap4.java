package gettingStartedCollectionFrameWork.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap4 {
    public static void main(String[] args) {
        String str = "aabbbcccc";
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Loop through each character and count
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Print the result in "char → count" format
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}