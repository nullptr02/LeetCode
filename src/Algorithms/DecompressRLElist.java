package Algorithms;

import java.util.Arrays;

public class DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {

        int size = 0;

        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }
        int[] result = new int[size];
        int index = 0;

        for (int i = 0; i < nums.length; i += 2) {

            int freq = nums[i];
            int val = nums[i + 1];

            for (int j = 0; j < freq; j++) {
                result[index] = val;
                index++;
            }


        }

        return result;
    }


    public static void main(String[] args) {
        DecompressRLElist u = new DecompressRLElist();

        int[] nOne = {1, 2, 3, 4};
        int[] nTwo = {1, 1, 2, 3};
        System.out.println((Arrays.toString(u.decompressRLElist(nOne)))); //[2,4,4,4]
        System.out.println((Arrays.toString(u.decompressRLElist(nTwo)))); //[1,3,3]


    }
}
