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
        double startTime = System.nanoTime();


        String[] arrOfPalindromes = {" ", "", "redivider", "Pearl", "Snow", "deified", "civic", "radar", "benji", "level", "rotor", "sugar", "kayak", "lucky", "reviver", "racecar", "husky", "madam", "refer", "Veronica", "Michael"};

        IsPalindrome u = new IsPalindrome();
        u.result(arrOfPalindromes);

        double endTime = System.nanoTime();
        double duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        duration /= 1000000;
        System.out.println(duration + " in milliseconds");

    }
}
