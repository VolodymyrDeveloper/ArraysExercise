package ArraysExercise;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        /**Create next array of Integers with values: 2,3,1,7,11.
         *  Sort them by DESC(reverseOrder).*/
        Integer array[] = new Integer[]{2, 3, 1, 7, 11};
        Arrays.sort(array);
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]--);
        }
    }
}

