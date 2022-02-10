package Algorithms;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {

        int size = s.length;
        int secondPointer = size - 1;
        for (int i = 0; i < size / 2; i++) {

            // get first character
            char temp = s[i];

            // store last char with ith char
            s[i] = s[secondPointer];

            //store first char at the end
            s[secondPointer] = temp;

            secondPointer--;
        }

        System.out.println(Arrays.toString(s));

    }

    public static void main(String[] args) {
        ReverseString u = new ReverseString();

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        u.reverseString(s);
    }
}
