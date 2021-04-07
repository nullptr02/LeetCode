package AprilChallenge;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinOperations {
    public int minOperations(int n) {
        int result = 0;

        while (n > 0) {
            result += n - 1;
            n -= 2;
        }


        return result;
    }


    public static void main(String[] args) {
        MinOperations u = new MinOperations();
        int oneEx = 3;
        int twoEx = 6;

        //System.out.println(u.minOperations(oneEx));
        System.out.println(u.minOperations(twoEx));

    }
}
