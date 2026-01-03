import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 22, 3, 4, 5);

        System.out.println(numbers.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())));
    }
}
