package done.easy;

//Remove duplicates in-place, return new length.
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]

public class RemoveDuplicateFromSortedArray {

    private static int removeDuplicates(int[] nums) {

        if(nums.length < 2) return 0;

        int slowPointer = 1;
        for(int fastPointer = 1; fastPointer < nums.length; fastPointer++) {
            if(nums[fastPointer] != nums[slowPointer]) {
                nums[slowPointer] = nums[fastPointer];
                slowPointer++;
            }
        }
        return slowPointer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        int answer = removeDuplicates(nums);
        System.out.println(answer);
    }
}
