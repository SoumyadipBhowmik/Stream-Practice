package done.easy;

//Reverse a string in-place.
//Input: s = ['h','e','l','l','o']
//Output: ['o','l','l','e','h']

import java.util.Arrays;

public class ReverseAString {

    private static void reverse(char[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while(first < last) {
            char temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    private static String reverse(String input) {

        char[] arr = input.toCharArray();
        int first = 0;
        int last = arr.length - 1;
        while(first < last) {
            char temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
//     char[] arr = {'h', 'e', 'l', 'l', 'o'};
     String input = "hello";
        String reverse = reverse(input);
        System.out.println(reverse);
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
