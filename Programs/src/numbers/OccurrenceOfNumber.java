package numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurrenceOfNumber {

    private static void findOccurrence(List<Integer> numbers) {

        Map<Integer, Integer> answer = new HashMap<>();

        for(int number: numbers) {
            answer.put(number, answer.getOrDefault(number, 0) + 1);
        }
        answer.forEach((key, value) -> System.out.println(key + " " + value));
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
