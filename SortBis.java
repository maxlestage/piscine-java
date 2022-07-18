import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// import java.util.stream.Collectors;

public class SortBis {

    public static List<Integer> sortChoice(List<Integer> list, Comparator<Integer> comparator) {
        if (list != null) {
            List<Integer> sortedList = new ArrayList<>(list);
            sortedList.sort(comparator);
            return sortedList;
        } else {
            return null;
        }
    }

    public static List<Integer> sort(List<Integer> list) {
        return sortChoice(list, Comparator.naturalOrder());
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        return sortChoice(list, Comparator.reverseOrder());
    }

}
