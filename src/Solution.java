


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Use a HashMap to store word frequencies
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        // Read the line of text
        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            
            // Split the text into individual words by spaces
            String[] words = input.split("\\s+");

            for (String word : words) {
                // If word is empty (can happen with extra spaces), skip it
                if (word.isEmpty()) continue;
                
                // Update the frequency in the map
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }

            // Print the unique words and their counts
            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        sc.close();
    }
}