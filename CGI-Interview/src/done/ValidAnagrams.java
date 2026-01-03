package done;

//Check if two strings are anagrams (same letters, different order).
//Input: s = "anagram", t = "nagaram"
//Output: true

import java.util.HashMap;
import java.util.Map;

public class ValidAnagrams {

    private static boolean validAnagram(String rawWord1, String rawWord2) {
        String word1 = rawWord1.toLowerCase();
        String word2 = rawWord2.toLowerCase();

        if(word1.length() != word2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for(char word: word1.toCharArray()) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for(char word: word2.toCharArray()) {
            if(!map.containsKey(word)) {
                return false;
            }
            map.put(word, map.getOrDefault(word, 0) - 1);
        }

        for(int count: map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "anagram";
        String t = "nagaram";

        System.out.println(validAnagram(input, t));
    }
}
