package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Map {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        Integer[] array = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        List<Integer> ar = new ArrayList<Integer>(Arrays.asList(array));


        int pairs = 0;
        for (Integer i : ar) {
            if (map.containsKey(i)) {
                map.remove(i);

                pairs++;
            } else {
                map.put(i, 1);
            }
        }

        System.out.println(map);


        System.out.println(pairs);

    }
}
