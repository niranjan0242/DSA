package Strings;

public class PalindromeCheck {
    public static String pali(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;

    }

    public static void main(String[] args) {
        String input = "mg";

        if (pali(input).equals(input)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
