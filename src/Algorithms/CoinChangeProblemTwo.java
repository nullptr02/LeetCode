package Algorithms;

public class CoinChangeProblemTwo {
    public int change(int n, int[] coinArr) {
        int[] arr = new int[n + 1];
        arr[0] = 1;

        for (int coin : coinArr) {
            for (int i = coin; i < n + 1; ++i) {
                arr[i] += arr[i - coin];
            }
        }
        return arr[n];
    }

    public static void main(String args[]) {
        CoinChangeProblemTwo u = new CoinChangeProblemTwo();
        int coinArr[] = {1, 2, 3};

        System.out.println("Solution:");
        System.out.println(u.change(3, coinArr));
    }

}
