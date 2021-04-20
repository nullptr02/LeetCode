package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class CheckIfPangram {
//
//    public boolean checkIfPangram(String sentence) {
//        boolean result = true;
//        String _sentence = sentence;
//        Map<Character, Integer> stats = new HashMap<Character, Integer>();
//
//        stats = insert(stats, _sentence);
//        result = verify(stats);
//
//        return result;
//    }
//
//    public boolean verify(Map stats) {
//        boolean result = true;
//        String abc = "abcdefghijklmnopqrstuvwxyz";
//        char[] arr = abc.toCharArray();
//
//        for (Character i : arr) {
//
//            //int getVal = (int) stats.get(i);
//
//            if (!stats.containsKey(i)) {
//                result = false;
//            }
//
//        }
//
//
//        return result;
//    }
//
//    public Map<Character, Integer> insert(Map stats, String _sentence) {
//
//        char[] arr = _sentence.toCharArray();
//
//        for (Character i : arr) {
//
//            if (!stats.containsKey(i)) {
//                stats.put(i, 1);
//            } else {
//
//                Integer getVal = (Integer) stats.get(i);
//                stats.put(i, getVal + 1);
//            }
//
//        }
//        return stats;
//    }


    public boolean checkIfPangram(String sentence) {
        boolean result = true;
        int[] chars = new int[26];
        char[] strToCharArr = sentence.toCharArray();

        for (int i = 0; i < strToCharArr.length; i++) {
            int charValue = strToCharArr[i];
            int newArrIndex = charValue - 97;
            chars[newArrIndex] = chars[newArrIndex] + 1;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 0) {
                result = false;
            }
        }


        return result;
    }

    public static void main(String[] args) {

        CheckIfPangram u = new CheckIfPangram();
        String one = "thequickbrownfoxjumpsoverthelazydog";
        String two = "leetcode";
        System.out.println(u.checkIfPangram(one)); // True
        System.out.println(u.checkIfPangram(two)); // False
    }


}
