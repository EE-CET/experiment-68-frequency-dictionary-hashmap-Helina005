import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Use a TreeMap to automatically sort keys alphabetically
        TreeMap<String, Integer> frequencyMap = new TreeMap<>();

        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            String[] words = input.split("\\s+");

            for (String word : words) {
                if (word.isEmpty()) continue;
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }

            // Printing from a TreeMap will now follow alphabetical order
            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        sc.close();
    }
}