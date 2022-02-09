package Algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumNew {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length == 0) {
            return result;
        }

//  Brute Force Algo
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                int first = nums[i];
//                int second = nums[j];
//                if (((first + second) == target)) {
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                result[1] = i;
                result[0] = map.get(temp);
                return result;
            }
            map.put(nums[i], i);

        }


        return result;
    }

    public static void main(String[] args) {
        TwoSumNew u = new TwoSumNew();

        int[] arrOne = {2, 7, 11, 15};
        int targetOne = 9;
        System.out.println(Arrays.toString(u.twoSum(arrOne, targetOne)));

        int[] arrTwo = {3, 2, 4};
        int targetTwo = 6;
        System.out.println(Arrays.toString(u.twoSum(arrTwo, targetTwo)));

        int[] arrThree = {3, 3};
        int targetThree = 6;
        System.out.println(Arrays.toString(u.twoSum(arrThree, targetThree)));

        int[] arrFour = {2, 5, 5, 11};
        int targetFour = 10;
        System.out.println(Arrays.toString(u.twoSum(arrFour, targetFour)));
    }
}
