package string_manipulation;

import java.util.Scanner;

public class ReverseAString {

    private static void reverseAString(String word) {
        char[] letters = word.toCharArray();
        int firstIndex = 0;
        int lastIndex = letters.length - 1;

        while (firstIndex < lastIndex) {
            char temp = letters[firstIndex];
            letters[firstIndex] = letters[lastIndex];
            letters[lastIndex] = temp;
            firstIndex++;
            lastIndex--;
        }
        System.out.println(new String(letters));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        reverseAString(input);
        scanner.close();
    }
}
