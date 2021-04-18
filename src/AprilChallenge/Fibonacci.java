package AprilChallenge;

public class Fibonacci {
    public int fib(int n) {


        //result = fibRec(n);


        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

//    public int fibRec(int n) {
//        if (n <= 1) {
//            return n;
//        }
//
//        return (fibRec(n - 1) + fib(n - 2));
//    }


    public static void main(String[] args) {

        Fibonacci u = new Fibonacci();
        System.out.println(u.fib(4));


    }
}
