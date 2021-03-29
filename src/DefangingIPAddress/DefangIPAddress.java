package DefangingIPAddress;

public class DefangIPAddress {

    public String defangIPaddr(String address) {

        String result = "";

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                result += "[.]";
            } else {
                result += address.charAt(i);
            }
        }


        return result;

    }


    public static void main(String[] args) {

        DefangIPAddress u = new DefangIPAddress();
        String solution = u.defangIPaddr("1.1.1.1");
        System.out.println(solution);


    }
}
