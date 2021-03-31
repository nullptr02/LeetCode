package Algorithms;

import java.util.Scanner;

public class CesarCipher {

    public String Encrypt(String in, int shiftAmt) {
        String result = "";
        String copy = in;
        int stringSize = in.length();


        for (int i = 0; i < stringSize; i++) {

            char c = in.charAt(i);
            int asciiValue = c;

            //For uppercase letters
            if (asciiValue >= 65 && asciiValue <= 90) {
                int diff = Math.abs(65 - 90) + 1;
                char encodedChar = (char) ('A' + (((c - 'A') + shiftAmt) % diff));
                result += encodedChar;

            }


            //For lowercase letters
            if (asciiValue >= 97 && asciiValue <= 122) {
                int diff = Math.abs(97 - 122) + 1;
                char encodedChar = (char) ('a' + (((c - 'a') + shiftAmt) % diff));
                result += encodedChar;

            }

            //For symbols
            if (asciiValue >= 33 && asciiValue <= 47) {
                int diff = Math.abs(33 - 47) + 1;
                char encodedChar = (char) ('!' + (((c - '!') + shiftAmt) % diff));
                result += encodedChar;

            }

            //For numbers
            if (asciiValue >= 48 && asciiValue <= 57) {
                int diff = Math.abs(48 - 57) + 1;
                char encodedChar = (char) ('0' + (((c - '0') + shiftAmt) % diff));
                result += encodedChar;
            }

            //For other symbols
            if (asciiValue >= 91 && asciiValue <= 96) {
                int diff = Math.abs(91 - 96) + 1;
                char encodedChar = (char) ('[' + (((c - '[') + shiftAmt) % diff));
                result += encodedChar;

            }

            //For other symbols
            if (asciiValue >= 58 && asciiValue <= 64) {
                int diff = Math.abs(64 - 58) + 1;
                char encodedChar = (char) (':' + (((c - ':') + shiftAmt) % diff));
                result += encodedChar;

            }

            //For other symbols
            if (asciiValue >= 123 && asciiValue <= 126) {
                int diff = Math.abs(126 - 123) + 1;
                char encodedChar = (char) ('{' + (((c - '{') + shiftAmt) % diff));
                result += encodedChar;

            }

            //For white space
            if (asciiValue == 32) {

                result += ' ';

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
        String testTwo = "~";

        int shiftOne = 102;
        //System.out.println(testOne);
        System.out.println(u.Encrypt(testOne, shiftOne));
        //System.out.println(u.Encrypt(testTwo, shiftOne));


    }


}
