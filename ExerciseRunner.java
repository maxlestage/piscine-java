// import java.util.List;
// import java.time.Duration;
// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.Period;
// import java.util.Set;

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
                // System.out.println(Palindrome.isPalindrome("ressasser"));
                // System.out.println(Palindrome.isPalindrome("Bonjour"));
                // System.out.println(Palindrome.isPalindrome("kayak"));
                // System.out.println(Palindrome.isPalindrome("k"));
                // System.out.println(Palindrome.isPalindrome("AbBa"));
                // System.out.println(Palindrome.isPalindrome("Kay ak"));

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
                /*
                 * System.out.println(ListSearchIndex.findLastIndex(List.of(9, 13, 89, 8, 89,
                 * 23, 1, 0, 89), 89));
                 * 
                 * System.out.println(ListSearchIndex.findFirstIndex(List.of(9, 13, 89, 8, 23,
                 * 1, 0, 89), 89));
                 * 
                 * System.out.println(ListSearchIndex.findAllIndexes(List.of(9, 13, 89, 89, 8,
                 * 23,
                 * 1, 0, 89), 89).toString());
                 * 
                 * System.out.println(
                 * ListSearchIndex.findAllIndexes(List.of(43784, 327, 1903, 3847, 327, 327,
                 * 3289), 43784)
                 * .toString());
                 * 
                 * System.out.println(ListSearchIndex
                 * .findAllIndexes(List.of(43784, 327, 43784, 1903, 3847, 43784, 327, 327,
                 * 3289), 43784));
                 * 
                 * System.out.println(
                 * ListSearchIndex.findAllIndexes(List.of(28, 4893, 438, 54857, 4374, 4893,
                 * 48394), 4893));
                 * 
                 * System.out.println(ListSearchIndex.findAllIndexes(List.of(), 4893));
                 * 
                 * System.out.println(
                 * ListSearchIndex.findAllIndexes(List.of(43784, 327, 1903, 3847, 327, 327,
                 * 3289), 489));
                 * 
                 * System.out.println(
                 * ListSearchIndex.findAllIndexes(List.of(43784, 327, 1903, 3847, 327, 327,
                 * 3289), 489));
                 * 
                 * System.out.println(ListSearchIndex.findAllIndexes(List.of(43784, 327, 1903,
                 * 3847, 327, 327,
                 * 3289), 327).toString());
                 * 
                 * System.out.println(ListSearchIndex.findAllIndexes(List.of(
                 * 327, 327, 1903,
                 * 327, 3847,
                 * 327, 327, 327,
                 * 3289), 327));
                 * 
                 * System.out.println(ListSearchIndex.findAllIndexes(List.of(89, 13, 89, 89, 8,
                 * 23,
                 * 1, 0, 89), 89).toString());
                 * 
                 * System.out.println(ListSearchIndex.findAllIndexes(List.of(1000, 13, 89, 89,
                 * 8, 23,
                 * 1, 0, 89), 89).toString());
                 * 
                 * System.out.println(ListSearchIndex.findAllIndexes(List.of(
                 * 100,
                 * 100, 1000, 3847, 327, 327,
                 * 3289), 100).toString());
                 * 
                 * System.out.println(ListSearchIndex.findLastIndex(List.of(9, 13, 89, 8, 23, 1,
                 * 0, 89), 89));
                 * System.out.println(ListSearchIndex.findFirstIndex(List.of(9, 13, 89, 8, 23,
                 * 1, 0, 89), 89));
                 */

                // ListEqual
                /*
                 * System.out.println(ListEqual.areListEquals(List.of("Alice", "Bob", "Charly",
                 * "Emily"),
                 * List.of("Alice", "Bob", "Charly", "Emily")));
                 * System.out.println(ListEqual.areListEquals(List.of("Alice", "Bob", "Charly",
                 * "Emily"),
                 * List.of("Alice", "Bob", "Emily", "Charly")));
                 * System.out.println(ListEqual.areListEquals(List.of("Alice", "Bob", "Charly",
                 * "Emily"),
                 * List.of("Alice", "Bob", "Charly", "Emily")));
                 * System.out.println(ListEqual.areListEquals(List.of("Bonjour", "Gracias",
                 * "Hello"),
                 * List.of("Bonjour", "Hello")));
                 * System.out.println(ListEqual.areListEquals(List.of("Bonjour", "Gracias",
                 * "Hello"),
                 * List.of()));
                 * System.out.println(ListEqual.areListEquals(List.of("Bonjour", "Gracias",
                 * "Hello"),
                 * List.of("")));
                 * System.out.println(ListEqual.areListEquals(List.of(),
                 * List.of("")));
                 */

                // ParseDate
                /*
                 * System.out.println(ParseDate.parseIsoFormat("2022-04-25T20:51:28.709039322"))
                 * ;
                 * System.out.println(ParseDate.parseIsoFormat(""));
                 * System.out.println(ParseDate.parseFullTextFormat("lundi 25 avril 2022"));
                 * System.out.println(ParseDate.parseFullTextFormat(""));
                 * System.out.println(ParseDate.parseFullTextFormat("vendredi 18 mai 2018"));
                 * System.out.println(ParseDate.
                 * parseTimeFormat("09 heures du soir, 07 minutes et 23 secondes"));
                 * System.out.println(ParseDate.
                 * parseTimeFormat("08 heures du soir, 07 minutes et 23 secondes"));
                 * System.out.println(ParseDate.parseTimeFormat(""));
                 */

                // FormatDate
                /*
                 * System.out.println(FormatDate.formatToFullText(LocalDateTime.of(2021, 8, 22,
                 * 13, 25, 46)));
                 * System.out.println(FormatDate.formatToFullText(LocalDateTime.of(2021, 10, 22,
                 * 13, 25, 46)));
                 * System.out.println(FormatDate.formatSimple(LocalDate.of(2022, 2, 13)));
                 * System.out.println(FormatDate.formatIso(LocalTime.of(16, 18, 56, 8495847)));
                 * System.out.println(FormatDate.formatIso(LocalTime.of(16, 18, 56)));
                 */

                // Duration
                /*
                 * Duration duration =
                 * DifferenceBetweenDate.durationBetweenTime(LocalTime.of(12, 54, 32),
                 * LocalTime.of(21, 23, 53));
                 * System.out.println(duration.toHoursPart() + "H" + duration.toMinutesPart() +
                 * "M"
                 * + duration.toSecondsPart() + "S");
                 * Duration duration1 =
                 * DifferenceBetweenDate.durationBetweenTime(LocalTime.of(19, 47, 43),
                 * LocalTime.of(12, 25, 57));
                 * System.out.println(duration1.toHoursPart() + "H" + duration1.toMinutesPart()
                 * +
                 * "M"
                 * + duration1.toSecondsPart() + "S");
                 * Period period = DifferenceBetweenDate.periodBetweenDate(LocalDate.of(2020,
                 * 10, 13),
                 * LocalDate.of(2022, 5, 8));
                 * System.out.println(period.getYears() + "Y" + period.getMonths() + "M" +
                 * period.getDays() + "D");
                 * System.out.println(DifferenceBetweenDate.numberOfHoursBetweenDateTime(
                 * LocalDateTime.of(2022, 4, 12, 16, 18, 56), LocalDateTime.of(2022, 5, 10, 21,
                 * 54, 56)));
                 * System.out.println(DifferenceBetweenDate.numberOfHoursBetweenDateTime(
                 * LocalDateTime.of(2021, 4, 12, 16, 18, 56), LocalDateTime.of(2022, 5, 10, 21,
                 * 54, 56)));
                 */

                // Sort
                /*
                 * System.out.println(Sort.sort(List.of(15, 1, 14, 18, 14, 98, 54, -1,
                 * 12)).toString());
                 * System.out.println(Sort.sortReverse(List.of(15, 1, 14, 18, 14, 98, 54, -1,
                 * 12)).toString());
                 */

                // SortBis
                /*
                 * System.out.println(SortBis.sort(List.of(15, 1, 14, 18, 14, 98, 54, -1,
                 * 12)).toString());
                 * System.out.println(SortBis.sortReverse(List.of(15, 1, 14, 18, 14, 98, 54, -1,
                 * 12))
                 * .toString());
                 */

                // KeepTheChange
                // System.out.println(KeepTheChange.computeChange(18, Set.of(1, 3, 7)));

                // celestialObject
                /*
                 * CelestialObject celestialObject = new CelestialObject();
                 * System.out.println(celestialObject.x);
                 * System.out.println(celestialObject.y);
                 * System.out.println(celestialObject.z);
                 * System.out.println(celestialObject.name);
                 */
                /*
                 * CelestialObject defaultStar = new CelestialObject();
                 * System.out.println(defaultStar.x);
                 * System.out.println(defaultStar.y);
                 * System.out.println(defaultStar.z);
                 * System.out.println(defaultStar.name);
                 * 
                 * CelestialObject earth = new CelestialObject("Terre", 0.43, 0.98, 1.43);
                 * System.out.println(earth.x);
                 * System.out.println(earth.y);
                 * System.out.println(earth.z);
                 * System.out.println(earth.name);
                 */

                /*
                 * CelestialObject defaultStar = new CelestialObject();
                 * System.out.println(defaultStar.getX());
                 * System.out.println(defaultStar.getY());
                 * System.out.println(defaultStar.getZ());
                 * System.out.println(defaultStar.getName());
                 * 
                 * defaultStar.setName("Terre");
                 * defaultStar.setX(0.43);
                 * defaultStar.setY(0.98);
                 * defaultStar.setZ(1.43);
                 * System.out.println(defaultStar.getX());
                 * System.out.println(defaultStar.getY());
                 * System.out.println(defaultStar.getZ());
                 * System.out.println(defaultStar.getName());
                 */

                // CelestialObject defaultStar = new CelestialObject();
                // CelestialObject earth = new CelestialObject("Terre", 1.0, 2.0, 2.0);
                // CelestialObject celestialObject1 = new CelestialObject("Altair", 12.45,
                // 328.8437, -328.3923);
                // CelestialObject celestialObject2 = new CelestialObject("Vega", 489.31,
                // -12.473, 218.43);
                // CelestialObject celestialObject3 = new CelestialObject();
                // CelestialObject earth2 = new CelestialObject();
                // System.out.println("Test getDistanceWith : ");
                // System.out.println(earth.getDistanceWith(defaultStar));
                // System.out.println();
                // System.out.println("Test getDistanceBetween : earth2 = () ");
                // System.out.println(CelestialObject.getDistanceBetween(defaultStar, earth2));
                // System.out.println("Test getDistanceWithInKm : ");
                // System.out.println(earth.getDistanceWithInKm(defaultStar));
                // System.out.println();
                // System.out.println(CelestialObject.getDistanceBetweenInKm(defaultStar,
                // earth));
                // System.out.println();
                // System.out.println("Test getDistanceBetweenInKm : earth2 = () ");
                // System.out.println(CelestialObject.getDistanceBetweenInKm(defaultStar,
                // earth2));
                // System.out.println();
                // System.out.println("Test getDistanceBetweenInKm : celestialObject1 = () ");
                // System.out.println(CelestialObject.getDistanceBetweenInKm(defaultStar,
                // celestialObject1));
                // System.out.println();
                // System.out.println("Test getDistanceBetweenInKm : celestialObject2 = () ");
                // System.out.println(CelestialObject.getDistanceBetweenInKm(defaultStar,
                // celestialObject2));
                // System.out.println();
                // System.out.println("Test getDistanceBetweenInKm : celestialObject3 = () ");
                // System.out.println(CelestialObject.getDistanceBetweenInKm(defaultStar,
                // celestialObject3));
                // System.out.println();
                // System.out.println(CelestialObject.KM_IN_ONE_AU);

                // StarUtils
                CelestialObject celestialObject = new CelestialObject();
                CelestialObject earth = new CelestialObject("Terre", 1.0, 2.0, 2.0);
                CelestialObject earth1 = new CelestialObject("Terre", 1.0, 2.0, 2.0);
                CelestialObject earth2 = new CelestialObject("Terre", 1333.322220, 2243.009887, 2.23330);
                CelestialObject altair = new CelestialObject("Altair", 12.450, 328.844, -328.392);
                // 12.450, 328.844, -328.392

                System.out.println();
                System.out.println("celestialObject");
                System.out.println(celestialObject.toString());

                System.out.println();
                System.out.println("earth");
                System.out.println(earth.toString());

                System.out.println();
                System.out.println("earth1");
                System.out.println(earth1.toString());

                System.out.println();
                System.out.println("earth2");
                System.out.println(earth2.toString());

                System.out.println();
                System.out.println("altair");
                System.out.println(altair.toString());

                System.out.println();
                System.out.println("earth.equals(earth1)");
                System.out.println(earth.equals(earth1));

                System.out.println();
                System.out.println("earth.equals(celestialObject)");
                System.out.println(earth.equals(celestialObject));
        }

}