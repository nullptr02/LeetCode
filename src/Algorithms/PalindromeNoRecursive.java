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


        double startTime = System.nanoTime();


        String[] arrOfPalindromes = {" ","","redivider", "Pearl", "Snow", "deified", "civic", "radar", "benji", "level", "rotor", "sugar", "kayak", "lucky", "reviver", "racecar", "husky", "madam", "refer", "Veronica", "Michael"};
        PalindromeNoRecursive u = new PalindromeNoRecursive();
        u.result(arrOfPalindromes);

        double endTime = System.nanoTime();
        double duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        duration /= 1000000;
        System.out.println(duration + " in milliseconds");

    }
}
