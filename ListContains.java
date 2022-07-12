import java.util.List;

public class ListContains {
    public static boolean containsValue(List<Integer> list, Integer value) {
        return List.of(list).contains(value);
    }
}