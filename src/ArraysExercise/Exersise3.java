package ArraysExercise;

public class Exersise3 {
    public static void main(String[] args) {
        /**You have array {3,2,3,1,4,2,8,3}.
         *  Replace all duplicated values by 0. Result should be  next: {3,2,0,1,4,0,8,0}*/

        Integer arrayFromTask[] = new Integer[]{3, 2};
        Integer arrayAfterReplace[] = new Integer[arrayFromTask.length];

        for (int i = 0; i < arrayFromTask.length; i++) {
            for (int j = 0; j < arrayAfterReplace.length; j++) {
                if (arrayFromTask[i]==arrayAfterReplace[j]) {
                }

            }

        }
        for (int i = 0; i < arrayFromTask.length; i++)
            System.out.print(arrayAfterReplace[i]);
        System.out.println("");
        for (int j = 0; j < arrayAfterReplace.length; j++)
            System.out.print(arrayAfterReplace[j]);

    }
}




//
//
//        int chyslo = 10;
//        int replay = 0;
//        int array [] = new int[] {10,10,1,10,10};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == chyslo) {
//                array[i]= replay;
//            }
//        }
//
//
//            for (int j = 0; j < array.length; j++) {
//                System.out.println(array[j]);
//            }
//        System.out.println(replay);







