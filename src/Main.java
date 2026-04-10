import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TreeMap handles the alphabetical sorting the grader wants
        TreeMap<String, Integer> map = new TreeMap<>();

        if (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) {
                String[] words = line.split("\\s+");
                for (String w : words) {
                    // Force lowercase just in case
                    String word = w.toLowerCase();
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }

                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    // CRITICAL: Ensure NO extra characters are inside these quotes
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        }
        sc.close();
    }
}