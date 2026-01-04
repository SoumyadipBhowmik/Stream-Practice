package done.easy;

//Find the first non-repeating character's index.
//Input: s = "leetcode"
//Output: 0 ('l' is first unique)

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String input = "lleettccoode";
        int uniqueCharacter = firstUniqueCharacter(input);
        System.out.println(uniqueCharacter);
    }

    private static int firstUniqueCharacter(String input) {
        int[] count = new int[26];

        for(char character: input.toCharArray()) {
            count[character - 'a']++;
        }

        for(int index = 0; index < input.length(); index++) {
            if(count[input.charAt(index) - 'a'] == 1) {
                return index;
            }
        }
        return -1;
    }
}

