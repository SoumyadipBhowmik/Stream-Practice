package done.easy;

//Check if array has any duplicates.
//Input: nums = [1,2,3,1]
//Output: true

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    private static boolean checkIfContainsDuplicate(int[] input) {
        if (input.length < 2) return false;

        Set<Integer> answer = new HashSet<>();
        for(int i = 0; i < input.length; i++) {
            if(answer.contains(input[i])) {
                return true;
            }
            answer.add(input[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,5,1,2};

        System.out.println(checkIfContainsDuplicate(input));
    }
}
