package AprilChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterCombinations {

    final char[][] charArr = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'},
            {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public List<String> letterCombinations(String digits) {
        int strLen = digits.length();
        List<String> result = new ArrayList<>();
        if (strLen == 0) {
            return result;
        }
        bfs(0, strLen, new StringBuilder(), result, digits);
        return result;
    }

    public void bfs(int index, int strLen, StringBuilder sb, List<String> result, String digits) {
        if (index == strLen) {
            result.add(sb.toString());
        } else {
            char[] letters = charArr[Character.getNumericValue(digits.charAt(index))];
            for (int i = 0; i < letters.length; i++)
                bfs(index + 1, strLen, new StringBuilder(sb).append(letters[i]), result, digits);
        }
    }

    public static void main(String[] args) {
        String one = "2";
        String two = "23";
        String three = "234";

        LetterCombinations u = new LetterCombinations();
        System.out.println(u.letterCombinations(one));
        System.out.println(u.letterCombinations(two));
        System.out.println(u.letterCombinations(three));


    }
}
