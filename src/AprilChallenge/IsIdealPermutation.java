package AprilChallenge;

public class IsIdealPermutation {

    public boolean isIdealPermutation(int[] A) {
        boolean result = false;
        int global = 0;
        int local = 0;

        for (int i = 0; i < A.length; i++)
            if (i - A[i] > 1 || i - A[i] < -1) return false;
        return true;


        //Global inversions
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 1+i; j <= A.length - 1; j++) {
//                int iVal = A[i];
//
//                int jVal = A[j];
//                if (iVal > jVal) {
//                    global++;
//                }
//            }
//        }
//
//
//        //Local Inversion
//        for (int i = 0; i < A.length - 1; i++) {
//
//            if (A[i] > A[i + 1]) {
//                local++;
//            }
//
//        }
//
//        if (global == local) {
//            result = true;
//        }
//
//
//        return result;
    }


    public static void main(String[] args) {
        IsIdealPermutation u = new IsIdealPermutation();
        int[] A = {1, 0, 2};
        int[] B = {1, 2, 0};
        int[] C = {1, 0};

        System.out.println(u.isIdealPermutation(A)); //true
        System.out.println(u.isIdealPermutation(B)); //false
        System.out.println(u.isIdealPermutation(C)); //true


    }
}
