import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class PredicateLearning {

    public static void main(String[] args) {

        int number = 5;

//        Predicate<Integer> isEven = x -> x % 2 == 0;
//        System.out.println(isEven.test(number));

//        Predicate<String> word = x -> x.toLowerCase().startsWith("b");
//        Predicate<String> end = x -> x.toLowerCase().endsWith("k");
//        Predicate<String> and = word.and(end);
//        System.out.println(and.test("Abhishek"));

        UnaryOperator<Integer> squareOfANumber = x -> x * x;
        System.out.println(squareOfANumber.apply(number));

//        Consumer<Integer> printer = System.out::println;
//        printer.accept(number);
    }
}
