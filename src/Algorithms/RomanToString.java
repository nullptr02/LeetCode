package Algorithms;

public class RomanToString {
    public int romanToInt(String s) {
        int result = 0;
        int[] arr = new int[s.length()];
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'M') {
                arr[i] = 1000;
            }
            if (s.charAt(i) == 'D') {
                arr[i] = 500;
            }
            if (s.charAt(i) == 'C') {
                arr[i] = 100;
            }
            if (s.charAt(i) == 'L') {
                arr[i] = 50;
            }
            if (s.charAt(i) == 'X') {
                arr[i] = 10;
            }
            if (s.charAt(i) == 'V') {
                arr[i] = 5;
            }
            if (s.charAt(i) == 'I') {
                arr[i] = 1;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int first = arr[i];
            int second = arr[i + 1];
            if (first < second) {
                arr[i] = -arr[i];
            }
            sum += arr[i];

        }

        result = sum + arr[arr.length - 1];


        return result;

    }

    public static void main(String[] args) {
        RomanToString u = new RomanToString();

        System.out.println(u.romanToInt("MCMXCIV"));
        System.out.println(u.romanToInt("LVIII"));
        System.out.println(u.romanToInt("IX"));
        System.out.println(u.romanToInt("X"));
        System.out.println(u.romanToInt("IV"));
        System.out.println(u.romanToInt("VI"));
        System.out.println(u.romanToInt("III"));


    }

}
