package done.easy;

//Merge two sorted arrays into one sorted array.
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        mergeSortedArray(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    private static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n -1;
        
        while(m > 0 && n > 0) {
            if(nums1[m - 1] > nums2[n - 1]) {
                nums1[last] = nums1[m - 1];
                m--;
            } else {
                nums1[last] = nums2[n - 1];
                n--;
            }
            last--;
        }
        
        while( n > 0) {
            nums1[last] = nums2[n - 1];
            last--;
            n--;
        }
    }
}
