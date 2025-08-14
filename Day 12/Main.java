import java.util.*;

public class Main {
    public static void main(String[] args) {
        // List example (allows duplicates)
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");  // Duplicate allowed
        System.out.println("List: " + fruits);

        // Set example (no duplicates)
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Apple"); // Duplicate ignored
        System.out.println("Set: " + uniqueFruits);
    }
}
