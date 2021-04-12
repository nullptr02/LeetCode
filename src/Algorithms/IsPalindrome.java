package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {

    public List result(String[] x) {
        List result = new ArrayList();


        int i = 0;
        int pos = 0;
        palindromeRec(pos, result, false, x, i);


        System.out.println(result);
        return result;
    }

    private List palindromeRec(int pos, List result, boolean flag, String[] x, int arrIndex) {

        String temp = x[arrIndex];
        int stringLen = temp.length();
        int arrLen = x.length;

        if (pos == (stringLen / 2) && flag && (arrIndex < arrLen)) {
            result.add(temp);
            return palindromeRec(0, result, true, x, arrIndex + 1);

        } else {

            char first = temp.charAt(pos);
            char second = temp.charAt(stringLen - 1 - pos);

            if ((first == second) && pos != (stringLen / 2)) {
                return palindromeRec(pos + 1, result, true, x, arrIndex);

            } else if (pos < (stringLen / 2) - 1) {
                return palindromeRec(pos + 1, result, false, x, arrIndex);

            }

        }

        return result;

    }


    public static void main(String[] args) {
        String[] arrOfPalindromes = {"radar", "xyz", "abc", "racecar", "madam", "aslknnsc", "aba","abba"};
        int [] arr ={1,2,3,3,45,5,6,7,7};
        IsPalindrome u = new IsPalindrome();
        u.result(arrOfPalindromes);

    }
}
