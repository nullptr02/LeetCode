package Attic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsPrime {

    public void determinePrime(int number) {
        ArrayList results = new ArrayList<Integer>();
        int _number = number;
        int[] arr = new int[_number];
        generateArr(arr);
        calculatePrimes(arr, results);
        printResults(results, _number);

    }

    public void calculatePrimes(int[] arr, ArrayList<Integer> results) {

        int lengthOfArr = arr.length;
        for (int i = 1; i < lengthOfArr; i++) {
            int testNumber = arr[i];
            boolean testNum = factors(testNumber);

            if (testNum) {
                results.add(testNumber);
            }
        }

    }

    public boolean factors(int temp) {
        boolean result = true;

        for (int i = 2; i <= temp / 2; i++) {

            if (temp % i == 0) {
                result = false;
                break;
            }

        }


        return result;
    }

    public void printResults(ArrayList<Integer> results, int size) {
        System.out.println("List of primes for 1 to " + size);
        for (Integer i : results) {
            System.out.print(i + " ");

        }
    }

    public void generateArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1);
        }
    }

    public static void main(String[] args) {
        double startTime = System.nanoTime();

        IsPrime u = new IsPrime();
        int numbers = 1000;
        u.determinePrime(numbers);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        duration /= 1000000;
        System.out.println("\n\n" + duration + " in seconds");

    }
}
