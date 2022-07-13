import java.util.List;

public class ListEqual {
    public static boolean areListEquals(List<String> list1, List<String> list2) {

        // Si pas null :
        if (list1 != null && list2 != null) {
            // si meme size :
            if (list1.size() == list2.size()) {
                // si m
                if (list1.get(0) != "" && list2.get(0) != "") {
                    if (list1.equals(list2)) {
                        return true;
                    } else {
                        return false;
                    }
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
