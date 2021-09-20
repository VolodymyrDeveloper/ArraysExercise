package ArraysExercise;

public class Exercise1 {
    public static void main(String[] args) {
        /** Why arrays in java initialize with fixed size and can’t be dynamic?
         *  Because computer doesn't know how much memory to allocate array.*/

        /**You get an array of numbers(should contain both positive and negative numbers),
         and return the sum of all the positive ones.
         (If there are nothing to sum, sum should be 0)*/

        Integer array2[] = new Integer[]{3, 5, -3, -5};
        int sum = 0;

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 0)
                sum = sum + array2[i];
        }
        System.out.println(sum);
    }
}

