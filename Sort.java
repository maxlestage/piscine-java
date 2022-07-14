import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    public static List<Integer> sort(List<Integer> list) {
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        return sortedList;
        // [-1, 1, 12, 14, 14, 15, 18, 54, 98]
    }

    // public static List<Integer> sortReverse(List<Integer> list) {
    // // your code here
    // [98,54,18,15,14,14,12,1,-1]
    // }
}