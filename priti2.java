import java.util.HashMap;

public class WordCount {
    
    public static void main(String[] args) {
        String inputString = "This is a sample input string to count the number of words";
        
        HashMap<String, Integer> wordCountMap = countWords(inputString);
        
        System.out.println("Word counts:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
    
    public static HashMap<String, Integer> countWords(String input) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        // Split the input string into words
        String[] words = input.split("\\s+");
        
        // Count the occurrences of each word
        for (String word : words) {
            // Remove any leading or trailing punctuation
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            
            // Convert the word to lowercase for case-insensitive counting
            word = word.toLowerCase();
            
            // Update the count in the map
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        
        return wordCountMap;
    }
}