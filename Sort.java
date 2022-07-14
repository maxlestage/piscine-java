import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    public static List<Integer> sort(List<Integer> list) {
        if (list.size() != 0) {
            List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
            return sortedList;
        } else {
            return null;
        }
        // [-1, 1, 12, 14, 14, 15, 18, 54, 98]
    }

    public static List<Integer> sortReverse(List<Integer> list) {

        if (list.size() != 0) {
            List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            return sortedList;
        } else {
            return null;
        }
        // [98,54,18,15,14,14,12,1,-1]
    }
}