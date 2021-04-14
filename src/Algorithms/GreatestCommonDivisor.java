package Algorithms;

public class GreatestCommonDivisor {

    //Brute Force Method
    public void calcGCDBruteForce(int numberOne, int numberTwo) {

        int smallerNumber = Math.min(numberOne, numberTwo);
        int GCD = 0;

        for (int i = 1; i < smallerNumber; i++) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                GCD = i;
            }
        }

        System.out.println("Brute Force " + GCD);


    }

    public void calcGCDRecursive(int numberOne, int numberTwo) {
        int gcd = calcGCDRecursiveHelper(numberOne, numberTwo);
        System.out.println("Recursive " + gcd);


    }

    public int calcGCDRecursiveHelper(int numberOne, int numberTwo) {


        if (numberTwo == 0) {
            return numberOne;
        }

        return calcGCDRecursiveHelper(numberTwo, numberOne % numberTwo);
    }

    public static void main(String[] args) {
        GreatestCommonDivisor u = new GreatestCommonDivisor();
        u.calcGCDBruteForce(1071, 462);
        u.calcGCDRecursive(1071, 462);
        u.calcGCDRecursive(462, 1071);

    }
}
