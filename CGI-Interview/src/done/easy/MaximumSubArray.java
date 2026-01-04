package done.easy;

//Find the contiguous subarray with the largest sum.
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6 (subarray [4,-1,2,1])

public class MaximumSubArray {
    private static int maxSubArray(int[] input) {
        int currentSum = input[0];
        int maxSum = input[0];

        for(int i = 1; i < input.length; i++) {
            currentSum = Math.max(currentSum + input[i], input[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
