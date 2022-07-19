public class StringContain {
    public static boolean isStringContainedIn(String subString, String s) {

        if (subString != null && s != null && subString != "" && s != "") {
            char firstWord = subString.charAt(0);
            char secondWord = s.charAt(0);
            return firstWord == secondWord;
        } else {
            return false;
        }

    }
}
