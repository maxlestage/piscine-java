import java.util.List;

public class ListEqual {
    public static boolean areListEquals(List<String> list1, List<String> list2) {

        if (list1 != null || list2 != null) {
            if (!list1.isEmpty() || !list2.isEmpty()) {
                if (!list1.get(0).equals("") || !list2.get(0).equals("")) {
                    if (list1.size() == list2.size()) {
                        if (list1.equals(list2)) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
