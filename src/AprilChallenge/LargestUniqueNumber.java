package AprilChallenge;

import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber {
    public int largestUniqueNumber(int[] A) {
        int result = -1;
        int index = 1;

        HashMap<Integer, Integer> largestNumMap = new HashMap<>();

        for (Integer i : A) {

            if (largestNumMap.containsKey(i)) {
                int count = largestNumMap.get(i);
                largestNumMap.put(i, count + 1);
            } else {
                largestNumMap.put(i, index);
            }
        }

        for (Map.Entry<Integer, Integer> entry : largestNumMap.entrySet()) {

            if (entry.getKey() > result && entry.getValue() < 2) {
                result = entry.getKey();
            }

        }

        return result;
    }


    public static void main(String[] args) {
        LargestUniqueNumber u = new LargestUniqueNumber();

        int[] A = {9, 9, 8, 8};
        int[] B = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        u.largestUniqueNumber(B);

        System.out.println(u.largestUniqueNumber(A));
        System.out.println(u.largestUniqueNumber(B));


    }
}
