package done.easy;

public class SecondLargestNumber {

    private static int secondLargest(int[] input) {

        if(input.length < 2 || input == null ) return -1;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num: input) {
            if(num > max) {
                secondMax = max;
                max = num;
            } else if (max > num && num > secondMax) {
                secondMax = num;
            }
        }
        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 0, 3, 12, 22};

        System.out.println(secondLargest(input));
    }
}
