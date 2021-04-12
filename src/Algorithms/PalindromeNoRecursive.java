package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNoRecursive {
    public List result(String[] x) {
        List result = new ArrayList();


        for (int i = 0; i < x.length; i++) {
            int index = 0;
            boolean testWord;

            String temp = x[i];
            while (index < temp.length() / 2) {
                char first = temp.charAt(index);
                char second = temp.charAt(temp.length() - 1 - index);
                if (first == second) {
                    testWord = true;
                } else {
                    testWord = false;
                }

                if ((index == (temp.length() / 2) - 1) && testWord) {
                    result.add(temp);
                }
                index++;
            }


        }


        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        String[] arrOfPalindromes = {"radar", "xyz", "abc", "racecar", "madam", "aslknnsc", "aba", "abba"};
        PalindromeNoRecursive u = new PalindromeNoRecursive();
        u.result(arrOfPalindromes);
    }
}
