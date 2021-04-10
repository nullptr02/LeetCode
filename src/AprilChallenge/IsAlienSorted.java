package AprilChallenge;

public class IsAlienSorted {
    public boolean isAlienSorted(String[] words, String order) {

        boolean result = true;

        for (int i = 0; i < words.length - 1; i++) {
            String tempOne = words[i];
            String tempTwo = words[i + 1];

            int tempCmpValOne = tempOne.compareTo(order);
            int tempCmpValTwo = tempTwo.compareTo(order);
            int strlenOne = tempOne.length();
            int strlenTwo = tempTwo.length();

            if (tempCmpValOne > tempCmpValTwo) {
                result = false;
            }

            if (strlenOne > strlenTwo) {
                result = false;
            }
        }


        return result;

    }


    public static void main(String[] args) {
        IsAlienSorted u = new IsAlienSorted();
        String[] sOne = {"hello", "leetcode"};
        String[] sTwo = {"word", "world", "row"};
        String[] sThree = {"apple", "app"};
        String[] sFour = {"kuvp", "q"};

        String oOne = "hlabcdefgijkmnopqrstuvwxyz";
        String oTwo = "worldabcefghijkmnpqstuvxyz";
        String oThree = "abcdefghijklmnopqrstuvwxyz";
        String oFour = "ngxlkthsjuoqcpavbfdermiywz";


        System.out.println(u.isAlienSorted(sOne, oOne)); // True
        System.out.println(u.isAlienSorted(sTwo, oTwo)); // False
        System.out.println(u.isAlienSorted(sThree, oThree)); // False
        System.out.println(u.isAlienSorted(sFour, oFour)); // True


    }
}
