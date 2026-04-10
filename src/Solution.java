import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TreeMap keeps words in alphabetical order
        TreeMap<String, Integer> frequencyMap = new TreeMap<>();

        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            
            // Split by whitespace
            String[] words = input.split("\\s+");

            for (String word : words) {
                if (word.isEmpty()) continue;
                
                // Convert to lowercase to match autograder expectations
                String cleanWord = word.toLowerCase();
                
                frequencyMap.put(cleanWord, frequencyMap.getOrDefault(cleanWord, 0) + 1);
            }

            // Print the results in 'word: count' format
            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        sc.close();
    }
}