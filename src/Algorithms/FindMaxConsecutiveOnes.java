package Algorithms;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        int size = nums.length;

        for (int i = 0; i < size; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }


        int result = Math.max(count, maxCount);
        return result;
    }

    public static void main(String[] args) {
        FindMaxConsecutiveOnes u = new FindMaxConsecutiveOnes();

        int[] arr = {1, 0, 1, 1, 0, 1};
        System.out.println(u.findMaxConsecutiveOnes(arr));
    }
}
