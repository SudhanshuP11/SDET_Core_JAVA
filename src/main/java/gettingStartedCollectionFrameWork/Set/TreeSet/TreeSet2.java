package gettingStartedCollectionFrameWork.Set.TreeSet;
import java.util.TreeSet;
public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(85);
        scores.add(72);
        scores.add(95);
        scores.add(60);
        scores.add(78);
        scores.add(90);

        System.out.println("All scores (sorted): " + scores);

        // Basic queries
        System.out.println("Lowest score:  " + scores.first());
        System.out.println("Highest score: " + scores.last());
        System.out.println("Total students: " + scores.size());

        // Navigation
        System.out.println("\n--- Navigation ---");
        System.out.println("Just above 80: " + scores.higher(80));  // 85
        System.out.println("Just below 80: " + scores.lower(80));   // 78
        System.out.println("Ceiling of 78: " + scores.ceiling(78)); // 78
        System.out.println("Floor of 79:   " + scores.floor(79));   // 78

        // Sub-sets
        System.out.println("\n--- Sub-sets ---");
        System.out.println("Scores below 80:      " + scores.headSet(80));
        System.out.println("Scores 80 and above:  " + scores.tailSet(80));
        System.out.println("Scores between 70-90: " + scores.subSet(70, 90));

        // Descending
        System.out.println("\n--- Descending ---");
        System.out.println("Top to bottom: " + scores.descendingSet());

        // Polling (remove & return)
        System.out.println("\n--- Polling ---");
        System.out.println("Remove lowest:  " + scores.pollFirst());
        System.out.println("Remove highest: " + scores.pollLast());
        System.out.println("After polling:  " + scores);
    }
}