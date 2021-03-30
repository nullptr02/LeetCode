package Algorithms;

import java.util.Scanner;

public class CesarCipher {

    public String Encrypt(String in, int shiftAmt) {
        String result = "";
        String copy = in;
        int stringSize = in.length();
        int alphaSize = 26;
        int copyShiftAmount = shiftAmt;


        for (int i = 0; i < stringSize; i++) {

            char c = in.charAt(i);
            int asciiValue = c;
            //System.out.println(asciiValue);

            //For uppercase letters
            if (asciiValue >= 65 && asciiValue <= 90) {
                int diff = Math.abs(65 - 90);
                result += (char) ((c + shiftAmt) % diff);
                //char temp = (char) ((c + shiftAmt) % diff);
                //result += "" + temp;


            }

            //For lowercase letters
            if (asciiValue >= 97 && asciiValue <= 122) {
                int diff = Math.abs(97 - 122);
                result += (char) (c + shiftAmt) % diff;


            }

            //For symbols
            if (asciiValue >= 33 && asciiValue <= 47) {
                int diff = Math.abs(33 - 47);
                result += (char) (c + shiftAmt) % diff;


            }

            //For numbers
            if (asciiValue >= 48 && asciiValue <= 57) {
                int diff = Math.abs(48 - 57);
                result += (char) (c + shiftAmt) % diff;
            }

            //For other symbols
            if (asciiValue >= 91 && asciiValue <= 96) {
                int diff = Math.abs(91 - 96);
                result += (char) (c + shiftAmt) % diff;


            }

            //For other symbols
            if (asciiValue >= 58 && asciiValue <= 64) {
                int diff = Math.abs(64 - 58);
                result += (char) (c + shiftAmt) % diff;


            }

            //For other symbols
            if (asciiValue >= 123 && asciiValue <= 126) {
                int diff = Math.abs(126 - 123);

                result += (char) (c + shiftAmt) % diff;


            }
        }


        return result;
    }

    public String Decrypt(String in, int shiftAmt) {
        String result = "";


        return result;
    }


    public static void main(String[] args) {
        CesarCipher u = new CesarCipher();

        String testOne = "Hello World~!";
        int shiftOne = 1;
        System.out.println(u.Encrypt(testOne, shiftOne));
        char c = 'c' + 1;

        System.out.println(c);
    }


}
