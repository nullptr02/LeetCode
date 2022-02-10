package Algorithms;

public class ReverseWords {
    public String reverseWords(String s) {
        if (s.length() == 0 || s == null) {
            return s;
        }
        char[] arr = s.toCharArray();
        int i = 0;
        int size = arr.length;
        for (int j = 0; j < arr.length; j++) {
            char c = arr[j];
            char target = ' ';
            if (c == target) {
                reverseHelper(arr, i, j - 1);
                i = 1 + j;

            }
        }

        reverseHelper(arr, i, size - 1);
        String result = new String(arr);
        return result;
    }

    public void reverseHelper(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            end--;
            start++;
        }

    }


    public static void main(String[] args) {
        ReverseWords u = new ReverseWords();
        String one = "Let's take LeetCode contest";
        String two = "God Ding";

        System.out.println(u.reverseWords(one));
        System.out.println("s'teL ekat edoCteeL tsetnoc");
        System.out.println(u.reverseWords(two));
    }
}
