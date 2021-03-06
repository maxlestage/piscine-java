import java.util.List;

public class ListEqual {
    public static boolean areListEquals(List<String> list1, List<String> list2) {

        if (list1 == null && list2 == null) {
            return true;
        } else if (list1 == null || list2 == null) {
            return false;
        }

        if (list1.isEmpty() && list2.isEmpty()) {
            return true;
        }

        // Si pas null :
        if (list1 != null && list2 != null) {
            // si même size :
            if (list1.size() == list2.size()) {
                // si index 0 différent de "" :
                if (list1.get(0) != "" && list2.get(0) != "") {
                    // si l
                    return list1.equals(list2);
                } else {
                    return false;
                }
            }
            return false;
        } else {
            return false;
        }

    }
}
