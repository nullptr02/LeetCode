package Algorithms;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CoinChange_PrintPermutations {
    /**
     * This method actually prints all the PERMUTATUION. It takes exponential time.
     */
    public static void printCoinChangingSolution(int total, int coins[], int n) {
        String result = "";
        int count = 0;
        printActualSolution(result, total, coins, n, count);
    }

    private static void printActualSolution(String result, int total, int coins[], int n, int count) {

        if (count == n) {
            return;
        }
        if (total == 0) {
            System.out.println(result + " ");
            return;
        }

        if (total < 0) {
            return;
        }


        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= total) {

                printActualSolution(coins[i] + " " + result, total - coins[i], coins, n, count++);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ASSUMPTION : all the values, ie coins that are provided have value less then the sum (k, here) that we need
        //  to construct

        int arr[] = {1, 5, 10};
        int k = 11;
        int n = 2;

        printCoinChangingSolution(k, arr, n);
    }

}