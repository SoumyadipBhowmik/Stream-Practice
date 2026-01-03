package done;

//Given an array of integers and a target, return indices of two numbers that add up to target.

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1] (because nums[0] + nums[1] = 9)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static int[] twoSum(int[] input, int target) {

        if (input.length < 2) return new int[0];
        Map<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < input.length; index++) {
            int complement = target - input[index];
            if(map.containsKey(complement)) {
                return new int[]{complement, index};
            }
            map.put(input[index], index);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println("Elements");
        int target = 9;
        Arrays.stream(arr).forEach(input -> System.out.print(input + " ") );
        System.out.println();
        int[] twoSum = twoSum(arr, target);
        System.out.println("The values in indexes: " + twoSum[0] + " and " + twoSum[1] + " sum upto target: " + target);
    }
}
