package Algorithms;

public class FindNumbers {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            String temp = Integer.toString(current);
            int mod = temp.length() % 2;
            if (mod == 0) {
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        FindNumbers u = new FindNumbers();
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(u.findNumbers(arr));
    }
}
