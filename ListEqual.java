import java.util.List;

public class ListEqual {
    public static boolean areListEquals(List<String> list1, List<String> list2) {
        if (!list1.isEmpty() && !list2.isEmpty()) {
            if (list1.equals(list2)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
