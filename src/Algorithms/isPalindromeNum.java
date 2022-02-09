package Algorithms;

public class isPalindromeNum {

    public boolean isPalindromeNum(int x) {
        boolean result = false;

        int temp = x;
        int sum = 0;

        while (temp > 0) {
            int last = (temp % 10);
            temp /= 10;
            sum = (sum * 10) + last;
        }
        if (sum == x) {
            result = true;
        }


        return result;
    }


    public static void main(String[] args) {

        isPalindromeNum x = new isPalindromeNum();

        System.out.println(x.isPalindromeNum(121));
        System.out.println(x.isPalindromeNum(123));
        System.out.println(x.isPalindromeNum(1212121));
        System.out.println(x.isPalindromeNum(898898));
        System.out.println(x.isPalindromeNum(456));


    }
}
