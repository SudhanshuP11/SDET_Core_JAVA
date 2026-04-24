package gettingStartedCollectionFrameWork.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("David",1);
        map.put("John",2);
        map.put("Sudhanshu",3);
        map.put("Pathak",4);
//        System.out.println("Map contains: " + map);
        System.out.println("Marks of david: "+map.get("David"));
        int val = map.getOrDefault("Rohit",0);
        System.out.println("Marks of Rohit: "+val);

        for(String key:map.keySet()) {
            System.out.println("Keys are: "+key);
        }
        for (int g:map.values()) {
            System.out.println("Keys are: "+g);
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("Keys are: "+entry.getKey());
            System.out.println("Keys are: "+entry.getValue());
        }

    }
}
