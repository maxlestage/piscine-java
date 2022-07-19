public class Palindrome {
    public static Boolean isPalindrome(String s) {

        String reversed = "";

        if (s != null) {
            if (s.length() != 1) {
                for (String part : s.split(" ")) {
                    reversed = new StringBuilder(part).reverse().toString();
                }
            }
            return reversed.equalsIgnoreCase(s);
        } else {
            return false;
        }

    }
}