package MarchChallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {


        boolean[] arr = new boolean[10001];
        int dup = 0, sum = 0, n = nums.length;
        for (int i : nums) {
            if (arr[i]) {
                dup = i;
            }
            arr[i] = true;
            sum += i;
        }
        int naturalSum = (n * (n + 1)) / 2;
        return new int[]{dup, dup + naturalSum - sum};

    }

    public static void main(String[] args) {

        int testOne[] = {1, 2, 2, 4}; // Output -> 2,3
        int testTwo[] = {1, 1}; // Output -> 1,2
        int testThree[] = {2, 2}; // Output -> 2,1
        int testFour[] = {1, 3, 3}; //Output -> 3,2


        FindErrorNums u = new FindErrorNums();

        System.out.println(Arrays.toString(u.findErrorNums(testOne)));
        System.out.println(Arrays.toString(u.findErrorNums(testTwo)));
        System.out.println(Arrays.toString(u.findErrorNums(testThree)));
        System.out.println(Arrays.toString(u.findErrorNums(testFour)));


    }
}
