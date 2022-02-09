package Algorithms;

import java.util.Arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {

        int size = nums.length;
        int[] result = new int[size];
        int start = 0;
        int end = size - 1;

        for (int i = size - 1; i >= 0; i--) {

            int square;

            if ((nums[start] * nums[start]) < (nums[end] * nums[end])) {
                square = nums[end];
                end--;
            } else {
                square = nums[start];
                start++;
            }
            result[i] = square * square;
        }
        return result;


    }

    public static void main(String[] args) {
        SortedSquares u = new SortedSquares();
        int[] arrOne = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(u.sortedSquares(arrOne)));
    }
}
