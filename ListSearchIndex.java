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
        if (list != null) {
            {
                if (!list.isEmpty()) {
                    if (list.contains(value)) {
                        return list.lastIndexOf(value);
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list != null) {
            if (!list.isEmpty()) {
                if (list.contains(value)) {
                    return list.indexOf(value);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> list_perso = new ArrayList<Integer>();
        if (value == null) {
            return null;
        }
        if (list != null) {
            if (!list.isEmpty()) {
                if (list.contains(value)) {

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(list.get(list.indexOf(value)))) {

                            list_perso.add(i);
                        }
                    }
                    return list_perso;
                } else {
                    return new ArrayList<Integer>();
                }
            } else {
                return new ArrayList<Integer>();
            }
        } else {
            return new ArrayList<Integer>();
        }

    }

}