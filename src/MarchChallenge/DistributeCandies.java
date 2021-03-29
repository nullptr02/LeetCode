package MarchChallenge;

import java.util.*;

public class DistributeCandies {


    public int distributeCandies(int[] candyType) {

        Set<Integer> setOfCandy = new HashSet<Integer>();
        int halfArray = candyType.length / 2;

        for (int i : candyType) {
            if (setOfCandy.add(i)) {
                if (setOfCandy.size() == halfArray) {
                    return setOfCandy.size();
                }
            }
        }
        return setOfCandy.size();

    }

    public static void main(String[] args) {

        //int candyType[] = {1, 1, 1, 2, 2, 2, 3, 3, 3, 1};
        //int candyType[] = {1, 1, 2, 2, 3, 3};
        //int candyType[] = {1, 3, 2, 1};
        int candyType[] = {6,6,6,6};


        //int candyType[] = {1, 1, 1, 1};
        DistributeCandies u = new DistributeCandies();
        int result = u.distributeCandies(candyType);

        System.out.println("Amount of candies she can eat: " + result);
    }


}
