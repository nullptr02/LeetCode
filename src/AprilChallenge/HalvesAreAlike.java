package AprilChallenge;

public class HalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        boolean result = false;
        String vowels = "aeiouAEIOU";
        String firstHalf = s.substring(0, s.length() / 2);
        String secondHalf = s.substring(s.length() / 2, s.length());
        int first = 0;
        int second = 0;


        for (char c: firstHalf.toCharArray()) {

            if(vowels.indexOf(c) != -1){
                first++;
            }
        }

        for (char c: secondHalf.toCharArray()) {

            if(vowels.indexOf(c) != -1){
                second++;
            }
        }

        if (first == second) {
            result = true;
        }

        return result;

    }

    public static void main(String[] args) {

        HalvesAreAlike u = new HalvesAreAlike();

        String a = "book";
        String b = "textbook";
        String c = "MerryChristmas";
        String d = "AbCdEfGh";

        System.out.println(u.halvesAreAlike(a)); //true
        System.out.println(u.halvesAreAlike(b)); //false
        System.out.println(u.halvesAreAlike(c)); //false
        System.out.println(u.halvesAreAlike(d)); // true


    }
}
