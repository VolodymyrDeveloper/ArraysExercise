package ArraysExercise;

public class Exercise2 {
    public static void main(String[] args) {
        /**You get an array of numbers, return the average of a list of numbers in this array.
         *  (Example -  array{1,2,4,1} -> avg = 2)*/

        int averageNumberArray;
        int sumArray = 0;
        int array[] = new int[]{5, 10, 15, 20, 25, 100};
        for (int i = 0; i < array.length; i++) {
            sumArray = sumArray + array[i];
        }
        averageNumberArray = sumArray / array.length;
        System.out.println(averageNumberArray);
    }
}
