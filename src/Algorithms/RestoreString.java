package Algorithms;

public class RestoreString {

    public String restoreString(String s, int[] indices) {

//        String result = "";
//        int arrLength = indices.length;
//
//        for (int i = 0; i < arrLength; i++) {
//
//            for (int j = 0; j < arrLength; j++) {
//
//                if (i == indices[j]) {
//                    result += s.charAt(j);
//                }
//
//            }
//
//        }
//
//        return result;

        char[] str = new char[s.length()];
        for (int i = 0; i < indices.length; i++)
            str[indices[i]] = s.charAt(i);

        String result = String.valueOf(str);
        return result;


    }

    public static void main(String[] args) {

        RestoreString u = new RestoreString();
        String s = "codeleet";
        int[] indexes = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(u.restoreString(s, indexes));

    }
}
