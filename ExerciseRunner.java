import java.util.List;

public class ExerciseRunner {
    public static void main(String[] args) {
        // Hello World !
        // System.out.println(HelloWorld.helloWorld());

        // IntOperation
        /*
         * System.out.println("Add");
         * System.out.println(IntOperation.addTwoIntegers(1, 2));
         * System.out.println(IntOperation.addTwoIntegers(15, 68));
         * 
         * System.out.println("Subtract");
         * System.out.println(IntOperation.subtractTwoIntegers(4, 1));
         * System.out.println(IntOperation.subtractTwoIntegers(10, 23));
         * 
         * System.out.println("Multiply");
         * System.out.println(IntOperation.multiplyTwoIntegers(3, 6));
         * System.out.println(IntOperation.multiplyTwoIntegers(12, 11));
         * 
         * System.out.println("Divide");
         * System.out.println(IntOperation.divideTwoIntegers(8, 2));
         * System.out.println(IntOperation.divideTwoIntegers(13, 4));
         */

        // FloatOperation
        /*
         * System.out.println("Add");
         * System.out.println(FloatOperation.addTwoFloats(1.0f, 2.5f));
         * System.out.println(FloatOperation.addTwoFloats(15.18f, 68.28347f));
         * 
         * System.out.println("Divide");
         * System.out.println(FloatOperation.divideTwoFloats(7.0f, 2.0f));
         * System.out.println(FloatOperation.divideTwoFloats(5.6f, 6.9f));
         */

        // IsEven
        /*
         * System.out.println(IsEven.isEven(2));
         * System.out.println(IsEven.isEven(26));
         * System.out.println(IsEven.isEven(57));
         */

        // Chifoumi
        /*
         * System.out.println(Chifoumi.getActionBeatenBy(ChifoumiAction.ROCK));
         * System.out.println(Chifoumi.getActionBeatenBy(ChifoumiAction.PAPER));
         * System.out.println(Chifoumi.getActionBeatenBy(ChifoumiAction.SCISSOR));
         */

        // StringLength
        /*
         * System.out.println(StringLength.getStringLength("Hello World !"));
         * System.out.println(StringLength.getStringLength(""));
         */

        // StringConcat
        /*
         * System.out.println(StringConcat.concat("Hello ", "étudiant !"));
         * System.out.println(StringConcat.concat("", "Hello World !"));
         */

        // StringContain
        /*
         * System.out.println(StringContain.isStringContainedIn("Hell",
         * "Highway to Hell"));
         * System.out.println(StringContain.isStringContainedIn("Hell",
         * "Hello World !"));
         * System.out.println(StringContain.isStringContainedIn("Bonjour",
         * "hello World !"));
         * System.out.println(StringContain.isStringContainedIn(null, "hello World !"));
         * System.out.println(StringContain.isStringContainedIn("", "hello World !"));
         */
        // Palindrome
        /*
         * System.out.println(Palindrome.isPalindrome("ressasser"));
         * System.out.println(Palindrome.isPalindrome("Bonjour"));
         * System.out.println(Palindrome.isPalindrome("kayak"));
         * System.out.println(Palindrome.isPalindrome("k"));
         * System.out.println(Palindrome.isPalindrome("AbBa"));
         * System.out.println(Palindrome.isPalindrome("Kay ak"));
         */

        // ComputeArray
        /*
         * int[] array = ComputeArray.computeArray(new int[] { 9, 13, 8, 23, 1, 0, 89
         * });
         * for (int i : array) {
         * System.out.print(i + " ");
         * }
         * int[] array2 = ComputeArray.computeArray(new int[] {});
         * for (int i : array2) {
         * System.out.print(i + " ");
         * }
         */

        // ListContains
        /*
         * System.out.println(ListContains.containsValue(List.of(9, 13, 8, 23, 1, 0,
         * 89), 8));
         * System.out.println(ListContains.containsValue(List.of(9, 13, 8, 23, 1, 0,
         * 89), 10));
         * System.out.println(ListContains.containsValue(List.of(28, 438, 54857, 4374,
         * 4893, 48394), 4893));
         */

        // ListSearchIndex
        System.out.println(ListSearchIndex.findLastIndex(List.of(9, 13, 89, 8, 23, 1, 0, 89), 89));
        System.out.println(ListSearchIndex.findFirstIndex(List.of(9, 13, 89, 8, 23, 1, 0, 89), 89));
        System.out.println(ListSearchIndex.findAllIndexes(List.of(9, 13, 89, 8, 23, 1, 0, 89), 89).toString());
        System.out.println(
                ListSearchIndex.findAllIndexes(List.of(43784, 327, 1903, 3847, 327, 327, 3289), 43784).toString());
        System.out.println(
                ListSearchIndex.findAllIndexes(List.of(43784, 327, 1903, 3847, 327, 327, 3289), 43784));
        System.out.println(
                ListSearchIndex.findAllIndexes(List.of(28, 4893, 438, 54857, 4374, 4893, 48394), 4893));
        System.out.println(
                ListSearchIndex.findAllIndexes(List.of(), 4893));

    }
}