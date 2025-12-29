package string_manipulation;

import java.util.Scanner;

public class CheckIfPalindrome {


    public static boolean checkIfPalindrome (String input) {

        int i = 0;
        int j = input.length() - 1;

        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(checkIfPalindrome(input));
    }
}
