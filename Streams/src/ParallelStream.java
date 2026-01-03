import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

    private static long factorial(int n) {

        long result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> numbers = Stream.iterate(0, x -> x + 1).limit(100).toList();

        long startTime2 = System.currentTimeMillis();
        System.out.println(numbers.stream().map(ParallelStream::factorial).toList());
        long endTime2 = System.currentTimeMillis();
        System.out.println("Without parallel stream, the time taken is: " + (endTime2 - startTime2) + " ms");

        long startTime = System.currentTimeMillis();
        System.out.println(numbers.parallelStream().map(ParallelStream::factorial).toList());
        long endTime = System.currentTimeMillis();
        System.out.println("With parallel stream, the time taken is: " + (endTime - startTime) + " ms");
    }

}
