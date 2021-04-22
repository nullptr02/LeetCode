package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {

    public int[] createTargetArray(int[] nums, int[] index) {

        int[] result = new int[nums.length];

        ArrayList<Integer> tempList = new ArrayList();

        for (int i = 0; i < index.length; i++) {
            int in = index[i];
            int val = nums[i];

            tempList.add(in, val);

        }

        for (int i = 0; i < tempList.size(); i++) {
            result[i] = tempList.get(i);
        }
        return result;
    }


    public static void main(String[] args) {
        CreateTargetArray u = new CreateTargetArray();
        int[] arr1 = {0, 1, 2, 3, 4};
        int[] arr2 = {0, 1, 2, 2, 1};

        System.out.println(Arrays.toString(u.createTargetArray(arr1, arr2)));

    }


}
