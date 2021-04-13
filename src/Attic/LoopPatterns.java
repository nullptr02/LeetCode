package Attic;

public class LoopPatterns {

    public void PatternA(int length) {


        for (int i = 0; i <= length; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.printf("%-5d", (j + 1));
            }
            System.out.println();

        }

    }

    public void PatternB(int length) {
        for (int i = 0; i <= length; i++) {


            for (int j = 0; j <= length - i; j++) {
                System.out.printf("%-5d", (j + 1));
            }
            System.out.println();

        }
    }

    public void PatternC(int length) {
        for (int i = 0; i <= length; i++) {


            for (int k = 0; k < length - i; k++) {
                System.out.print("     ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-5d", (j + 1));
            }

            System.out.println();

        }
    }

    public void PatternD(int length) {
        for (int i = 0; i <= length; i++) {

            for (int k = 0; k < length - length + i; k++) {
                System.out.print("     ");
            }

            for (int j = 0; j <= length - i; j++) {
                System.out.printf("%-5d", (j + 1));
            }


            System.out.println();


        }
    }

    public static void main(String[] args) {
        LoopPatterns u = new LoopPatterns();
        int length = 5;
        System.out.println("Pattern A:");
        u.PatternA(length);
        System.out.println("\n\n");
        System.out.println("Pattern B:");
        u.PatternB(length);
        System.out.println("\n\n");
        System.out.println("Pattern C:");
        u.PatternC(length);
        System.out.println("\n\n");
        System.out.println("Pattern D:");
        u.PatternD(length);
        System.out.println("\n\n");

    }
}
