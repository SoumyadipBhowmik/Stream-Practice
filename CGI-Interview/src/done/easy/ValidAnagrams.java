package done.easy;

//Check if two strings are anagrams (same letters, different order).
//Input: s = "anagram", t = "nagaram"
//Output: true

import java.util.HashMap;
import java.util.Map;

public class ValidAnagrams {

    private static boolean validAnagram(String rawWord1, String rawWord2) {
        String word1 = rawWord1.toLowerCase();
        String word2 = rawWord2.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int index = 0; index < word1.length(); index++) {
            map.put(word1.charAt(index), map.getOrDefault(word1.charAt(index), 0) + 1);
        }

        for (int index = 0; index < word2.length(); index++) {
            if (!map.containsKey(word2.charAt(index))) return false;
            map.put(word2.charAt(index), map.getOrDefault(word2.charAt(index), 0) - 1);
        }

        for (int count : map.values()) {
            if (count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Anagram";
        String t = "nagaram";

        System.out.println(validAnagram(input, t));
    }
}
