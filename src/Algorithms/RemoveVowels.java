package Algorithms;

public class RemoveVowels {

    public String removeVowels(String s) {

        String result = "";
        String vowels = "aeiouy";




        return s.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");

    }

    public static void main(String[] args) {

        String one = "leetcodeisacommunityforcoders";
        RemoveVowels u = new RemoveVowels();
        System.out.println(u.removeVowels(one));


    }

}
