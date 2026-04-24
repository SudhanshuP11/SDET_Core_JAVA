package gettingStartedCollectionFrameWork.Map.HashMap;

import java.util.HashMap;

public class HashMap3 {
    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy dog";
        HashMap<String,Integer> map = new HashMap<>();
        for(String word:text.split(" ")){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        System.out.println(map);
    }
}
