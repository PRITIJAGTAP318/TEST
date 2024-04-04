import java.util.HashMap;

public class DuplicateCharacters {
    
    public static void main(String[] args) {
        String inputString = "programming";
        HashMap<Character, Integer> duplicateMap = findDuplicateCharacters(inputString);
        
        System.out.println("Duplicate characters:");
        for (char ch : duplicateMap.keySet()) {
            if (duplicateMap.get(ch) > 1) {
                System.out.println(ch);
            }
        }
    }
    
    public static HashMap<Character, Integer> findDuplicateCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // Count occurrences of each character in the string
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        return charCountMap;
    }
}