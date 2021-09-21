package ArraysExercise;

import java.util.Arrays;

public class Exercise1_2 {
    public static void main(String[] args) {
        /* Why arrays in java initialize with fixed size and can’t be dynamic?
         *  Because computer doesn't know how much memory to allocate array.*/

        /*Create next array of Integers with values: 2,3,1,7,11.
         *  Sort them by DESC(reverseOrder).*/
        Integer array[] = new Integer[]{2, 3, 1, 7, 11};
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]--);
        }
    }
}

