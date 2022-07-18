import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {

    public static List<Integer> sort(List<Integer> list) {
        if (list != null) {
            List<Integer> sortedList = new ArrayList<>(list);
            sortedList.sort(Comparator.naturalOrder());
            return sortedList;
        } else {
            return null;
        }
        // [-1, 1, 12, 14, 14, 15, 18, 54, 98]
    }

    public static List<Integer> sortReverse(List<Integer> list) {

        if (list != null) {
            List<Integer> sortedList = new ArrayList<>(list);
            sortedList.sort(Comparator.reverseOrder());
            return sortedList;
        } else {
            return null;
        }
        // [98,54,18,15,14,14,12,1,-1]
    }

}