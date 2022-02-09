package Algorithms;

public class BinarySearch {
    public int search(int[] nums, int target) {

        if (nums.length == 0) {
            return -1;
        }

        int result = -1;

        int first = 0;
        int last = nums.length - 1;

        while (first <= last) {
            int middle = (int) Math.floor((first + last) / 2);
            int tempMiddleNum = nums[middle];

            if (target == tempMiddleNum) {
                result = middle;
                break;
            }

            // Condition if the target is in the second half of array
            if (target > tempMiddleNum) {
                first = middle + 1;
            }

            // If the target is in the first half of array
            if (target < tempMiddleNum) {
                last = middle - 1;
            }

            if (first > last) {
                result = -1;
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        BinarySearch u = new BinarySearch();

        int[] numsOne = {-1, 0, 3, 5, 9, 12};
        int targetOne = 9;


        System.out.println(u.search(numsOne, targetOne));
    }
}