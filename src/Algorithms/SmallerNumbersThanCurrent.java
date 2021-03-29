package Algorithms;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (index > nums[j]) {
                    result[i]+=1;
                }
            }

        }


        return result;

    }

    public static void main(String[] args) {

        SmallerNumbersThanCurrent u = new SmallerNumbersThanCurrent();
        int[] arrOne = {8, 1, 2, 2, 3}; // Output -> [4,0,1,1,3]

        System.out.println(Arrays.toString(u.smallerNumbersThanCurrent(arrOne)));
    }
}
