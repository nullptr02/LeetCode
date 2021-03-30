package Algorithms;

public class MaxProduct {
    public int maxProduct(int[] nums) {

        int result = 0;
        int firstIndex = Integer.MIN_VALUE;
        int secondIndex = Integer.MIN_VALUE;
        int arrLength = nums.length;

        if (arrLength == 1) {
            result = nums[0];
        }

        if (arrLength == 2) {
            result = (nums[0] - 1) * (nums[1] - 1);
        }

        for (int i = 0; i < arrLength; i++) {
            int current = nums[i];

            if (current >= secondIndex) {
                if (current >= firstIndex) {
                    secondIndex = firstIndex;
                    firstIndex = current;
                } else {
                    secondIndex = current;
                }
            }


        }

        result = (firstIndex - 1) * (secondIndex - 1);

        return result;

    }

    public static void main(String[] args) {
        MaxProduct u = new MaxProduct();
        int[] arrOne = {3, 4, 5, 2};
        int[] arrTwo = {1, 5, 4, 5};
        int[] arrThree = {3, 7};

        System.out.println(u.maxProduct(arrOne)); //12
        System.out.println(u.maxProduct(arrTwo)); //16
        System.out.println(u.maxProduct(arrThree)); //12


    }


}
