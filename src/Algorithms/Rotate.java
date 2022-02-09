package Algorithms;

import java.util.Arrays;

public class Rotate {
    public int[] rotate(int[] nums, int k) {

        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);


        return nums;
    }

    public void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        Rotate u = new Rotate();

        int[] arrOne = {1, 2, 3, 4, 5, 6, 7};
        int rotateOne = 3;
        int[] arrTwo = {-1, -100, 3, 99};
        int rotateTwo = 2;


        System.out.println(Arrays.toString(u.rotate(arrOne, rotateOne)));
        System.out.println("[5, 6, 7, 1, 2, 3, 4]");
        System.out.println(Arrays.toString(u.rotate(arrTwo, rotateTwo)));
        System.out.println("[3,99,-1,-100]");
    }

}
