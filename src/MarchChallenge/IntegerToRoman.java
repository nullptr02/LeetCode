package MarchChallenge;

public class IntegerToRoman {

    enum romans {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

        private int index;

        romans(int index) {
            this.index = index;
        }
    }

    public String intToRoman(int num) {
        String result = "";





            return result;
    }


    public static void main(String[] args) {
        IntegerToRoman u = new IntegerToRoman();

        System.out.println(u.intToRoman(100));

    }
}
