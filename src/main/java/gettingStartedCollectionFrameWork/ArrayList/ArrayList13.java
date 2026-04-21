package gettingStartedCollectionFrameWork.ArrayList;

import java.util.ArrayList;

public class ArrayList13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("javascript");
        list.add("go");

        String longestWord = list.get(0);

        for (String word : list) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
    }
}
