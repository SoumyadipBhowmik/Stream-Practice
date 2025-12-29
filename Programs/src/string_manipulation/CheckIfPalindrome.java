package string_manipulation;

import java.util.Scanner;

public class CheckIfPalindrome {


    private static boolean checkIfPalindrome (String input) {
        int firstIndex = 0;
        int lastIndex = input.length() - 1;
        while (firstIndex < lastIndex) {
            if (input.charAt(firstIndex) != input.charAt(lastIndex)) {
                return false;
            } else {
                firstIndex++;
                lastIndex--;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.nextLine();
        boolean ans = checkIfPalindrome(word);
        System.out.println(ans);
    }
}
