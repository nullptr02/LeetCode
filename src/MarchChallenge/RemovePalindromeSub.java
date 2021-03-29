package MarchChallenge;

public class RemovePalindromeSub {

    public int removePalindromeSub(String s) {

        int result = 1;

        if (s.length() == 0) {
            result = 0;
        }

        for (int i = 0; i < s.length() / 2; i++) {

            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                result=2;
            }

        }


        return result;
    }

    public static void main(String[] args) {

        RemovePalindromeSub u = new RemovePalindromeSub();
        String sOne = "baabb";
        String sTwo = "abb";
        String sThree = "ababa";
        String sFour = "bbaabaaa";

        System.out.println(u.removePalindromeSub(sOne));
        System.out.println(u.removePalindromeSub(sTwo));
        System.out.println(u.removePalindromeSub(sThree));
        System.out.println(u.removePalindromeSub(sFour));


    }

}
