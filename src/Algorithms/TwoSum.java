package Algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);

        }

        return result;
    }

    public static void main(String[] args) {

        TwoSum u = new TwoSum();
        int[] arrOne = {3, 2, 11, 7};
        int[] arrTwo = {3, 2, 4};
        int[] arrThree = {3, 3};
        int targetOne = 9;
        int targetTwo = 6;
        int targetThree = 6;
        System.out.println(Arrays.toString(u.twoSum(arrOne, targetOne)));
        System.out.println(Arrays.toString(u.twoSum(arrTwo, targetTwo)));
        System.out.println(Arrays.toString(u.twoSum(arrThree, targetThree)));

    }
}
