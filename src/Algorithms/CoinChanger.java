package Algorithms;

import java.util.Arrays;
import java.util.List;

public class CoinChanger {

    public int[] dpMakeChange(List<Integer> coinValueList, int change, int[] minCoins) {
        for (int cents = 0; cents <= change; cents++) {
            int coinCount = cents;
            for (Integer c : coinValueList) {
                if (c > cents) {
                    continue;
                }
                if (minCoins[cents - c] + 1 < coinCount) {
                    coinCount = minCoins[cents - c] + 1;
                }
            }
            minCoins[cents] = coinCount;
        }
        return minCoins;
    }

    public static void main(String[] args) {
        List<Integer> coinValueList = Arrays.asList(new Integer[]{1, 2, 3});
        int change = 10;
        int[] minCoins = new int[change + 1];
        int[] result = (new CoinChanger()).dpMakeChange(coinValueList, change, minCoins);
        for (int i = 0; i < result.length; i++) {
            System.out.println("For change = " + i + " number of coins = " + result[i]);
        }
    }
}