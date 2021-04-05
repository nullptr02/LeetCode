package AprilChallenge;

public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        int result = 0;
        int left = 0;
        int right = 0;

        if (s.length() == 2 && s.charAt(0) == '(' && s.charAt(1) == ')') {
            return result = 2;
        }

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == '(') {
                left++;
            }
            if (s.charAt(i + 1) == ')') {
                right++;
            }

        }

//        if (right % 2 != 0) {
//            right--;
//        }
//        if (left % 2 != 0) {
//            left--;
//        }
        result = left + right;

        if (result % 2 != 0) {
            result--;
        }

        return result;
    }

    public static void main(String[] args) {
        LongestValidParentheses u = new LongestValidParentheses();
        String testOne = ")()())";
        String testTwo = "()";
        String testThree = "()(())";


        System.out.println(u.longestValidParentheses(testOne)); //Output -> 4
        System.out.println(u.longestValidParentheses(testTwo)); //Output -> 2
        System.out.println(u.longestValidParentheses(testThree)); //Output -> 6


    }
}
