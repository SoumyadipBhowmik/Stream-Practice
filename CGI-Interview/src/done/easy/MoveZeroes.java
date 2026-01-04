package done.easy;

//Move all zeroes to the end while maintaining relative order.
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

import java.util.Arrays;

public class MoveZeroes {

    private static void moveZeroes(int[] input) {

       int nonZeroIndex = 0;
       for(int index = 0; index < input.length; index++) {
           if(input[index] != 0) {
               input[nonZeroIndex] = input[index];
               nonZeroIndex++;
           }
       }

       while(nonZeroIndex < input.length) {
           input[nonZeroIndex] = 0;
           nonZeroIndex++;
       }
    }

    public static void main(String[] args) {
        int[] input = {0,1,0,3,12};
        System.out.println("Before Moving Zeroes: " + Arrays.toString(input));
        moveZeroes(input);
        System.out.println("After Moving Zeroes: " + Arrays.toString(input));
    }
}
