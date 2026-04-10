import java.util.Scanner;
import java.util.LinkedHashMap; // Use LinkedHashMap for order
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLine()) return;
        String input = sc.nextLine();
        
        // Split input into words
        String[] words = input.split("\\s+");
        
        // LinkedHashMap maintains the order in which keys are first added
        LinkedHashMap<String, Integer> wordCountMap = new LinkedHashMap<>();
        
        for (String word : words) {
            // Check if word is empty (to handle leading/trailing spaces)
            if (word.isEmpty()) continue;
            
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        // Print results
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        sc.close();
    }
}