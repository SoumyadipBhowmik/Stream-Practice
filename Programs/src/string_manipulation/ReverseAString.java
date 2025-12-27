package string_manipulation;

import java.util.Scanner;

public class ReverseAString {

    public static String reverseString(String input) {

        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while(left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(reverseString(input));
        scanner.close();
    }
}
