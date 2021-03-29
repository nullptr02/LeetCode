package MarchChallenge;

import java.util.Arrays;
import java.util.Collections;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

//        int result = 0;
//        int nVal = nums[nums.length - 1];
//        int sumOfNums = (nVal * (nVal + 1)) / 2;
//        int sumOfArr = 0;
//        int diff = 0;
//
//        for (int i : nums) {
//            sumOfArr += i;
//        }
//
//        diff = sumOfNums - sumOfArr;
//        result = diff;
//
//        if (nums.length == 2) {
//
//            result += 2;
//        }
//
//        if (nums.length == 1) {
//
//            result += 1;
//        }
//
//        if (nums[0] == 1) {
//            result += 1;
//        }
//
//
//        return result;
        return nums.length * (nums.length + 1) / 2 - Arrays.stream(nums).sum();


    }

    public static void main(String[] args) {

        int arrOne[] = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int arrTwo[] = {3, 0, 1};
        int arrThree[] = {0, 1};
        int arrFour[] = {0};


        MissingNumber u = new MissingNumber();

        System.out.println(u.missingNumber(arrOne)); // Output -> 8
        System.out.println(u.missingNumber(arrTwo)); // Output -> 2
        System.out.println(u.missingNumber(arrThree)); // Output -> 2
        System.out.println(u.missingNumber(arrFour)); // Output -> 2


    }
}
