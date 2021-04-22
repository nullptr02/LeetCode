package Algorithms;

public class InterpretGoal {
    public String interpret(String command) {
        String result = "";

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {

                result += "G";
            }

            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                result += "o";

            }

            if ((command.charAt(i) == '(' && command.charAt(i + 1) != ')') && (command.charAt(i + 2) != '(' && command.charAt(i + 3) == ')')) {

                if (command.charAt(i + 1) == 'a' && command.charAt(i + 2) == 'l') {

                    result += "al";
                }

            }


        }


        return result;

    }

    public static void main(String[] args) {

        InterpretGoal u = new InterpretGoal();
        String one = "G()(al)";
        String two = "G()()()()(al)";
        String three = "(al)G(al)()()G";
        String four = "()()()()";

        System.out.println(u.interpret(one)); // Goal
        System.out.println(u.interpret(two)); // Gooooal
        System.out.println(u.interpret(three)); // alGalooG
        System.out.println(u.interpret(four)); // oooo


    }
}
