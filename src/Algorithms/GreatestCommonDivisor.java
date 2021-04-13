package Algorithms;

public class GreatestCommonDivisor {

    public void calcGCD(int numberOne, int numberTwo) {

        int largestNumber = Math.max(numberOne, numberTwo);
        int smallerNumber = Math.min(numberOne, numberTwo);
        int largestProduct = smallerNumber;
        int product = 1;

        while (largestProduct < largestNumber) {
            largestProduct *= product;
            product++;

            if (largestProduct > largestNumber) {
                product-=2;
            }
        }

        System.out.println(smallerNumber * product);
        int rem =  (product*smallerNumber);

        while (rem >=0){
            rem
        }



    }

    public static void main(String[] args) {
        GreatestCommonDivisor u = new GreatestCommonDivisor();
        u.calcGCD(1071, 462);

    }
}
