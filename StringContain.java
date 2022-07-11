public class StringContain {
    public static boolean isStringContainedIn(String subString, String s) {

        char firstWord = subString.charAt(0);
        char secondWord = s.charAt(0);

        if (firstWord == secondWord) {
            return true;
        } else {
            return false;
        }

    }
}
