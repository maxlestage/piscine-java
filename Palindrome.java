public class Palindrome {
    public static Boolean isPalindrome(String s) {
        String reversed = "";
        for (String part : s.split(" ")) {
            reversed = new StringBuilder(part).reverse().toString();
        }
        return reversed.toUpperCase().equals(s.toUpperCase());
    }
}