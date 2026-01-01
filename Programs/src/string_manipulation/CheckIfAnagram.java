package string_manipulation;

import java.util.HashMap;
import java.util.Map;

public class CheckIfAnagram {

    private static boolean checkIfAnagram(String rawWord1, String rawWord2) {
        String word1 = rawWord1.toLowerCase();
        String word2 = rawWord2.toLowerCase();

        if(word1.length() != word2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for(int index = 0; index < word1.length(); index++) {
            map.put(word1.charAt(index), map.getOrDefault(word1.charAt(index), 0) + 1);
        }

        for(int index = 0; index < word2.length(); index++) {
            if(!map.containsKey(word2.charAt(index))) {
                return false;
            } else {
                map.put(word2.charAt(index), map.getOrDefault(word2.charAt(index), 0) - 1);
            }
        }
        for(int count: map.values()) {
            if(count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "LISTEn";
        String word2 = "ENLIST";
        boolean check = checkIfAnagram(word1, word2);
        System.out.println(check);
    }
}
