package Algorithms;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {

        int size = nums.length;
        int left = 0;
        int right = size - 1;
        int result = -1;


        while (left <= right) {

            int middle = left + ((right - left) / 2);

            if (left > right) {
                break;
            }


            //found the target and return array index of found element
            if (nums[middle] == target) {
                return middle;
            }


            // in the second half
            if (target > nums[middle]) {
                left = middle + 1;
            }


            // in the first half
            if (target < nums[middle]) {
                right = middle - 1;
            }
            
        }


        return left;

    }


    public static void main(String[] args) {
        SearchInsert u = new SearchInsert();

        int[] arrOne = {1, 3, 5, 6};
        int targetOne = 5;

        int[] arrTwo = {1, 3, 5, 6};
        int targetTwo = 2;

        //System.out.println(u.searchInsert(arrOne, targetOne));
        System.out.println(u.searchInsert(arrTwo, targetTwo));

    }

}
