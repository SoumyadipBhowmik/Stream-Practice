package string_manipulation;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    private static char firstNonRepeatingCharacter(String input) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        if (input.length() == 2) return input.charAt(0);
        if (input.isEmpty()) return '_';

        for (int index = 0; index < input.length(); index++) {
            map.put(input.charAt(index), map.getOrDefault(input.charAt(index), 0) + 1);
        }

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey).orElse('_');

    }

    public static void main(String[] args) {
        String input = "leetcodelover";
        char letter = firstNonRepeatingCharacter(input);
        System.out.println(letter);
    }
}
