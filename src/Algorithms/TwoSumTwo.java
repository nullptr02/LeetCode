package Algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTwo {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int arrSize = numbers.length;

        int start = 0;
        int end = arrSize - 1;

        while (start < end) {
            int first = numbers[start];
            int second = numbers[end];
            int sum = first + second;

            if (sum == target) {
                break;
            }
            if (sum > target) {
                end--;
            }

            if (sum < target) {
                start++;
            }
        }

        result[0] = start + 1;
        result[1] = end + 1;


        return result;
    }

    public static void main(String[] args) {
        TwoSumTwo u = new TwoSumTwo();
        int[] arrOne = {2, 7, 11, 15};
        int targetOne = 9;

        int[] arrTwo = {2, 3, 4};
        int targetTwo = 6;

        int[] arrThree = {-1, 0};
        int targetThree = -1;

        System.out.println(Arrays.toString(u.twoSum(arrOne, targetOne)));
        System.out.println(Arrays.toString(u.twoSum(arrTwo, targetTwo)));
        System.out.println(Arrays.toString(u.twoSum(arrThree, targetThree)));
    }
}
