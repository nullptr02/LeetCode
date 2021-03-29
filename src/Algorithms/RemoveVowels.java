package Algorithms;

public class RemoveVowels {

    public String removeVowels(String s) {

        String result = "";
        String vowels = "aeiouy";

//        for (int j = 0; j < s.length(); j++) {
//            if (s.charAt(j) != 'a' && s.charAt(j) != 'e' && s.charAt(j) != 'i' &&
//                    s.charAt(j) != 'o' && s.charAt(j) != 'u') {
//                result += s.charAt(j);
//
//            }
//
//        }


        return s.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");

    }

    public static void main(String[] args) {

        String one = "leetcodeisacommunityforcoders";
        RemoveVowels u = new RemoveVowels();
        System.out.println(u.removeVowels(one));


    }

}
