import java.util.*;

public class ListSearchIndex {

    /*
     * Write a function findLastIndex that returns the last index of an element in a
     * list. Returns null otherwise.
     * 
     * Write a function findFirstIndex that returns the first index of an element in
     * a list. Returns null otherwise.
     * 
     * Write a function findAllIndexes that returns a list of all indexes of an
     * element in a list. Returns an empty list otherwise.
     */

    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (!list.isEmpty() || value != null) {
            return list.indexOf(value);
        } else {
            return null;
        }
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (!list.isEmpty() || value != null) {
            return list.lastIndexOf(value);
        } else {
            return null;
        }
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> list_perso = new ArrayList<Integer>();

        if (value == null) {
            return null;
        }

        if (!list.isEmpty()) {

            if (list.indexOf(value) != list.lastIndexOf(value)) {
                list_perso.add(list.indexOf(value));
                list_perso.add(list.lastIndexOf(value));
                return list_perso;

            } else if (list.indexOf(value) == list.lastIndexOf(value)) {
                if (list.indexOf(value) >= 0) {

                    return new ArrayList<Integer>();

                }

                return list_perso;

            } else {
                return list_perso;
            }

        } else {
            return list_perso;
        }

    }
}