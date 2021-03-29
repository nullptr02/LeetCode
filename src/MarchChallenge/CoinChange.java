package MarchChallenge;

import java.util.Arrays;
import java.util.Collections;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {

        int result = -1;
        int[] tempArr = coins;
        Arrays.sort(coins);
        int max = coins[coins.length - 1];

        for (int i = 0; i < coins.length; i++) {
        }


        return max;
    }


    public static void main(String[] args) {
        CoinChange u = new CoinChange();

        int[] arrOne = {1, 2, 5};
        int targetAmountOne = 11;
        int[] arrTwo = {2};
        int targetAmountTwo = 3;
        int[] arrThree = {1};
        int targetAmountThree = 0;


        System.out.println(u.coinChange(arrOne, targetAmountOne));
        System.out.println(u.coinChange(arrTwo, targetAmountTwo));
        System.out.println(u.coinChange(arrThree, targetAmountThree));

    }
}
