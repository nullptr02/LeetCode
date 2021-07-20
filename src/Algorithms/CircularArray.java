package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArray {

    public List shiftArray(int d, List<Integer> list) {

        int size = list.size();
        List<Integer> result = new ArrayList<>(list);


        for (int i = 1; i <= size; i++) {
            int index = (d + i) % size;
            int element = list.get(i-1);
            result.set(index,element);

        }


        return result;
    }


    public static void main(String[] args) {
        CircularArray u = new CircularArray();

        List<Integer> lOne = new ArrayList<Integer>();
        lOne.add(0,1);
        lOne.add(1,2);
        lOne.add(2,3);
        lOne.add(3,4);
        lOne.add(4,5);


        System.out.println(u.shiftArray(1,lOne));


    }

}
