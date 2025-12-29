package string_manipulation;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    private static char firstNonRepeatingCharacter(String input) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i =0 ; i < input.length(); i++) {
            map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
        }

        return map.entrySet()
                .stream()
                .filter(value -> value.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey).orElse('_');
    }

    public static void main(String[] args) {
        String input = "leetcodelover";
        char letter = firstNonRepeatingCharacter(input);
        System.out.println(letter);
    }
}
