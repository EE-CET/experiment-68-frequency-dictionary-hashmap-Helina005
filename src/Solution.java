import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        TreeMap<String, Integer> frequencyMap = new TreeMap<>();

        if (sc.hasNextLine()) {
            // trim() removes leading/trailing whitespace that might cause extra newlines
            String input = sc.nextLine().trim();
            
            if (!input.isEmpty()) {
                String[] words = input.split("\\s+");

                for (String word : words) {
                    // Force lowercase to match the expected "hello", "java", etc.
                    String cleanWord = word.toLowerCase();
                    frequencyMap.put(cleanWord, frequencyMap.getOrDefault(cleanWord, 0) + 1);
                }

                // Print results
                for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        }
        sc.close();
    }
}