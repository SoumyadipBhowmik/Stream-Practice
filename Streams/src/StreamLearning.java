public class StreamLearning {
    public static void main(String[] args) {

//        // Lambda
//        Sound task = () -> System.out.println("Honk");
//        task.honk();
//
//        // Predicate
//        Predicate<Integer> isEven = x -> x % 2 == 1;
//        Predicate<String> startsWithA = x -> x.startsWith("A");
//
//        // Function
//        Function<String, Integer> lengthOfString = String::length;
//        Function<Integer, Integer> addition = a -> a * a;
//
//        // Consumer
//        Consumer<String> showHello = (x) -> System.out.println("Hello: " + x);
//
//        // Supplier
//        Supplier<Integer> supplyHundred = () -> 100;
//
//        // Using all
//        showHello.accept("Soumyadip");
//        System.out.println(addition.apply(100));
//        System.out.println(lengthOfString.apply("wah"));
//        System.out.println(startsWithA.test("Ankit"));

//        List<Integer> list = Arrays.asList(1, 2, 3);
//        list.stream().map(x -> x * 2).forEach(System.out::println);
//        System.out.println(list.stream().filter(x -> x == 2).count());
//        Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);
//        Integer i = reduce.orElseThrow(RuntimeException::new);
//        System.out.println(i);

        // Find Occurrence of characters
//        String sentence = "A quick";
//        System.out.println(sentence.chars().mapT(x -> x).);
        int n = 5;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println(result + " ");
    }
}