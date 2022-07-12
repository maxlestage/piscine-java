import java.util.*;

public class ListContains {
    public static boolean containsValue(List<Integer> list, Integer value) {

        if (list.size() != 0) {

            for (int x : list) {
                if (Objects.equals(x, value)) {
                    return true;
                }
            }
        }
        return false;
    }
}