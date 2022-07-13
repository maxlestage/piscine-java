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
            if (list.contains(value)) {
                return list.indexOf(value);
            } else {
                return null;
            }

        } else {
            return null;
        }

    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (!list.isEmpty() || value != null) {
            if (list.contains(value)) {
                return list.lastIndexOf(value);
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

        // Si list isNot empty :
        if (!list.isEmpty() || list == null) {

            // si la list contient la value :
            if (list.contains(value)) {

                // Pour i = 0; tant que i inf à la taille de list; incr i++ :
                for (int i = 0; i < list.size(); i++) {

                    // si la valeur de la list à cet index est eq à l'index de list pour i :
                    if (list.get(i).equals(list.get(list.indexOf(value)))) {

                        // ajout de l'index dans le tableau :
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

    }

}