package numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurrenceOfNumber {

    private static void findOccurrence(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        map.forEach((integer, integer2) -> System.out.println(integer + " " + integer2));
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(10);
        numbers.add(13);
        numbers.add(44);
        numbers.add(12);
        numbers.add(13);
        numbers.add(13);
        findOccurrence(numbers);
    }
}
