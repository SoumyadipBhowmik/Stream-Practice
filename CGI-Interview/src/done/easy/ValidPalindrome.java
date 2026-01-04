package done.easy;

//Check if string is a palindrome (ignore non-alphanumeric, case-insensitive).
//Input: s = "A man, a plan, a canal: Panama"
//Output: true

public class ValidPalindrome {
    private static boolean validPalindrome(String input) {

        int first = 0;
        int last = input.length() - 1;

        while(first < last) {
            if(!Character.isLetterOrDigit(input.charAt(first))) {
                first++;
            } else if (!Character.isLetterOrDigit(input.charAt(last))) {
                last--;
            } else {
                if(Character.toLowerCase(input.charAt(first)) != Character.toLowerCase(input.charAt(last))) {
                    return false;
                }
                first++;
                last--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(input));
    }
}
