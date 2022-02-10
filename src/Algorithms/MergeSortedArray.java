package Algorithms;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Two Pointer Approach
        int pointerOne = m - 1;
        int pointerTwo = n - 1;
        int index = m + n - 1;
        while (pointerTwo >= 0) {
            if ((pointerOne >= 0) && (nums1[pointerOne] > nums2[pointerTwo])) {
                nums1[index--] = nums1[pointerOne--];
            } else {
                nums1[index--] = nums2[pointerTwo--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        MergeSortedArray u = new MergeSortedArray();
        int[] numsOne = {1, 2, 3, 0, 0, 0};
        int[] numsTwo = {2, 5, 6};
        int m = 3;
        int n = 3;

        u.merge(numsOne, m, numsTwo, n);

    }

}
