package Attic;

public class ModNumbers {
    public static void main(String[] args) {

        int x = 48 % 24;
        int shift = 1;
        String test = "abcdef";

        String result = "Hello";
        String shifted = "";

        StringBuffer answer = new StringBuffer();

        for (int i = 0; i < result.length(); i++) {

            if (result.charAt(i) != '\0') {
                char ch = (char) ((int)(result.charAt(i) - (shift - 65) % 26 + 65));
                answer.append(ch);

            }

        }
        System.out.println(answer);

    }
}
