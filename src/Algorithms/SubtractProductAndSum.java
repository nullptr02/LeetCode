package Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {

        int result = 0;
        int sum = 0;
        int product = 1;

        int length = Integer.toString(n).length();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {

            arr[length - i - 1] = n % 10;
            n /= 10;

            sum += arr[length - i - 1];
            product *= arr[length - i - 1];
        }

        result = product - sum;


//        for (int i = 1; i <= n; i *= 10) {
//            int digit = n/10
//
//            sum+=
//
//
//
//        }

        return result;

    }

    public static void main(String[] args) {
        SubtractProductAndSum u = new SubtractProductAndSum();

        System.out.println(u.subtractProductAndSum(234)); //15
        System.out.println(u.subtractProductAndSum(4421)); //21

    }
}
