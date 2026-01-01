package arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateElements {

    private static List<Integer> findDuplicates(int[] numbers) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        return map.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey).toList();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 6};
        System.out.println(findDuplicates(arr));

    }
}
