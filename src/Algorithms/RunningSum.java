package Algorithms;

import java.util.Arrays;

public class RunningSum {

    public int[] runningSum(int[] nums) {

        int result[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (i == 0) {
                result[0] = nums[i];
            } else {
                result[i] += (nums[i] + result[i - 1]);
            }

        }


        return result;

    }

    public static void main(String[] args) {


        RunningSum u = new RunningSum();

        int[] arrOne = {1, 2, 3, 4}; // Output -> [1,3,6,10]
        int[] arrTwo = {1, 1, 1, 1, 1}; // Output -> [1,2,3,4,5]
        int[] arrThree = {3, 1, 2, 10, 1}; // Output -> [3,4,6,16,17]
        System.out.println(Arrays.toString(u.runningSum(arrOne)));
        System.out.println(Arrays.toString(u.runningSum(arrTwo)));
        System.out.println(Arrays.toString(u.runningSum(arrThree)));


    }


}
