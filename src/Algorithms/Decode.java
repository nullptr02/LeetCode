package Algorithms;

import java.util.Arrays;

public class Decode {
    public int[] decode(int[] encoded, int first) {

        int arrSize = encoded.length;
        int[] result = new int[arrSize + 1];
        int firstPos = 0;
        int index = 1;
        result[firstPos] = first;

        for (int i : encoded) {
            result[index] = i ^ result[index - 1];
            index++;
        }

        return result;

    }


    public static void main(String[] args) {
        Decode u = new Decode();
        int first = 1;
        int second = 4;
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {6, 2, 7, 3};

        System.out.println(Arrays.toString(u.decode(firstArr, first)));
        System.out.println(Arrays.toString(u.decode(secondArr, second)));


    }
}
