package MarchChallenge;

public class Strobogrammatic {
    public boolean isStrobogrammatic(String num) {

        boolean result = false;
        int strLen = num.length();
        String cmp = "";

        for (int i = 0; i < strLen; i++) {
            cmp += num.charAt(strLen - 1 - i);
        }




        return result;

    }

    public static void main(String[] args) {

        Strobogrammatic u = new Strobogrammatic();
        System.out.println(u.isStrobogrammatic("69"));
        System.out.println(u.isStrobogrammatic("88"));
        System.out.println(u.isStrobogrammatic("1"));
        System.out.println(u.isStrobogrammatic("962"));


    }
}
