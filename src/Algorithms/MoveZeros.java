package Algorithms;

import java.util.Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int targetNumber = 0;
        for (int i = 0, j = i + 1; j < nums.length; j++) {

            int firstPointer = nums[i];
            int secondPointer = nums[j];
            if (firstPointer != targetNumber) {
                i++;
            } else if (secondPointer != targetNumber) {
                int tempNumber = nums[j];
                nums[j] = nums[i];
                nums[i] = tempNumber;
                i++;
            }
        }


        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        MoveZeros u = new MoveZeros();
        int[] arrOne = {1, 2, 3, 1};
        u.moveZeroes(arrOne);
    }
}
