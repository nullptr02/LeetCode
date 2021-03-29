package Algorithms;

public class NumberOfSteps {

    public int numberOfSteps(int num) {

        int result = 0;
        int temp = num;

        while (temp > 0) {
            if (temp % 2 == 0) {
                temp /= 2;
                result++;

            } else {
                temp -= 1;
                result++;
            }
        }


        return result;

    }


    public static void main(String[] args) {

        NumberOfSteps u = new NumberOfSteps();
        System.out.println(u.numberOfSteps(14)); //6
        System.out.println(u.numberOfSteps(8)); //4
        System.out.println(u.numberOfSteps(123)); //12


    }
}
