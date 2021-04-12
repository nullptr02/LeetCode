package Attic;

public class UsingCase {

    public static void main(String[] args) {


        int day = 6;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:

            case 7:
                System.out.println("Weekend!");

        }
        char c = '\u8FCE';
        System.out.println(c);
        System.out.println('\u6B22');
        char b = 'x';
        System.out.println(b++);
        System.out.println(b);

        System.out.println("He said Java is \"fun\"");


        char ch = (char)65.36;
        System.out.println(ch);

        int i = 'A';
        System.out.println(i);
        String one = ". . @ Hello World !";
        System.out.println(one.trim());
        String next = one.trim();
        System.out.println(next);

        String xyc = "1234.8653";
        double x = Double.parseDouble("1234.567");
        System.out.println(x);


    }


}
