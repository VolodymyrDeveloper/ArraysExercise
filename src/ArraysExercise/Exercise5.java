package ArraysExercise;

public class Exercise5 {
    public static void main(String[] args) {
        /*You have array {3,2,3,1,4,2,8,3}.
         *  Replace all duplicated values by 0. Result should be  next: {3,2,0,1,4,0,8,0}*/

        Integer arrayFromTask[] = new Integer[]{3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < arrayFromTask.length; i++) {
            for (int j = 0; j < arrayFromTask.length; j++) {
                if (i == j) {
                    continue;
                } else if (arrayFromTask[i] == arrayFromTask[j]) {
                    arrayFromTask[j] = 0;
                }
            }
        }
        for (int i = 0; i < arrayFromTask.length; i++)
            System.out.print(arrayFromTask[i]);
    }
}







