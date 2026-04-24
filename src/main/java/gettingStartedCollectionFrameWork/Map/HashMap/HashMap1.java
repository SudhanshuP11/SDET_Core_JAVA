package gettingStartedCollectionFrameWork.Map.HashMap;

import javax.sound.midi.SysexMessage;
import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice",85);
        map.put("Bob", 72);
        map.put("Charlie", 90);
        map.put("David", 68);

        System.out.println("All grades: "+map);
        // get specific value
        System.out.println("Alice grade: "+map.get("Alice"));

        // update overwrite old
        map.put("Alice",95);
        System.out.println("Alice new grade: "+map.get("Alice"));

        //check existence
        System.out.println("Has Bob? " + map.containsKey("Bob"));
        System.out.println("Has grade 90? " + map.containsValue(90));

        // getOrDefault — avoid null
        int eveGrade = map.getOrDefault("Eve", 0);
        System.out.println("Eve's grade: " + eveGrade);

        // Remove
        map.remove("David");
        System.out.println("After removing David: " + map);

        // Size
        System.out.println("Total students: " + map.size());
    }
}
