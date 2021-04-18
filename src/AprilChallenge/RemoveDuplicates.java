package AprilChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {
    public String removeDuplicates(String s, int k) {
        String result = "";
        Map<String, Integer> occurrences = new HashMap<String, Integer>();

        for (int i = 0; i < s.length() - 1; i++) {
            char temp = s.charAt(i);
            char tempTwo = s.charAt(i + 1);
            if (occurrences.containsKey(temp)) {
                int count = occurrences.get(i);
                String x = "";
                x += s.charAt(i);
                occurrences.put(x, count + 1);

            } else if (temp == tempTwo) {
                String adjacent = s.charAt(i) + "";
                adjacent += "!";

                occurrences.put(adjacent, 1);
            } else {
                String x = "";
                x += s.charAt(i);
                occurrences.put(x, 1);
            }
        }

        System.out.println(occurrences);

        for (Map.Entry index : occurrences.entrySet()) {

            int value = (Integer) index.getValue();
            String temp = (String) index.getKey();

            if (value < k && !(temp.contains("!"))) {
                String c = (String) index.getKey();
                result += c;
            }


        }


        return result;
    }

    public static void main(String[] args) {
        RemoveDuplicates u = new RemoveDuplicates();

//        System.out.println(u.removeDuplicates("abcd", 2));
//        System.out.println(u.removeDuplicates("deeedbbcccbdaa", 3));
//        System.out.println(u.removeDuplicates("pbbcggttciiippooaais", 2));
        u.removeDuplicates("abcd", 2);
//        u.removeDuplicates("deeedbbcccbdaa", 3);
//        u.removeDuplicates("pbbcggttciiippooaais", 2);
    }
}
