package Algorithms;

public class Battleship {
    public double getHitProbability(int R, int C, int[][] G) {
        // Write your code here
        int total = R * C;
        int count = 0;
        double result = 0.0;
        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                int temp = G[row][col];
                if (temp == 1) {
                    count++;
                }
            }
        }

        result = (double) count / total;
        return result;
    }

    public static void main(String[] args) {
        Battleship u = new Battleship();
        int[][] G = {{0, 0, 1}, {1, 0, 1}};
        int R = 2;
        int C = 3;
        System.out.println(u.getHitProbability(R, C, G));


    }
}
