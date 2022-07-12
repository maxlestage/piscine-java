public class ComputeArray {
    public static int[] computeArray(int[] array) {
        /*
         * if the item is a multiple of 3, the item is multiplied by 5
         * if the item is a multiple of 3 + 1 (e.g. 1, 4, 7, ...), the item is
         * incremented by 7
         * if the item is a multiple of 3 + 2 (e.g. 2, 5, 8, ...), the item stay as it
         * is.
         */

        if (array != null) {
            int[] my_arr = new int[array.length];
            for (int i = 0; i < array.length; i++) {

                if (array[i] % 3 == 0) {
                    array[i] = array[i] * 5;
                    my_arr[i] = array[i];

                } else if ((array[i] % 3) == 1) {
                    array[i] = array[i] + 7;
                    my_arr[i] = array[i];

                } else if ((array[i] * 3) == 2) {
                    my_arr[i] = array[i];

                } else {
                    my_arr[i] = array[i];
                }

            }
            return my_arr;
        } else {
            return null;
        }

    }
}
