package Algorithms;

public class IsValid {
    public boolean isValid(String s) {
/*        boolean result = false;
        int bracketOneCount = 0;
        int bracketTwoCount = 0;
        int bracketThreeCount = 0;


        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '{') {
                bracketOneCount++;
            }
            if (s.charAt(i) == '}') {
                bracketOneCount++;

            }
            if (s.charAt(i) == '(') {
                bracketTwoCount++;

            }
            if (s.charAt(i) == ')') {
                bracketTwoCount++;

            }
            if (s.charAt(i) == '[') {
                bracketThreeCount++;

            }
            if (s.charAt(i) == ']') {
                bracketThreeCount++;

            }


        }

        if (bracketOneCount % 2 == 0 && bracketTwoCount % 2 == 0 & bracketThreeCount % 2 == 0) {
            result = true;
        }


        return result;*/


        boolean result = false;
        StringBuilder b = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(')
                b.append(')');
            else if (c == '{')
                b.append('}');
            else if (c == '[')
                b.append(']');
            else if (b.length() == 0 || b.charAt(b.length() - 1) != c) {
                result = false;
            } else b.replace(b.length() - 1, b.length(), "");

        }
        result = b.length() == 0;
        return result;

        //return b.length() == 0;
    }

    public static void main(String[] args) {
        IsValid u = new IsValid();
        String one = "()";
        String two = "()[]{}";
        String three = "(]";

        System.out.println(u.isValid(one));
        System.out.println(u.isValid(two));
        System.out.println(u.isValid(three));

    }


}
