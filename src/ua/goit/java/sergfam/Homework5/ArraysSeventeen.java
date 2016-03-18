package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 17.03.2016 on 11:53.
 */
public class ArraysSeventeen {


    public static void ArrSeventeen() {


        int varMax = 0;
        int idxMax = 0;

        int arr[][] = new int[6][7];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = (int) (Math.random() * 10);

                System.out.print(arr[i][j] + "\t");

                if (j == 0) varMax = arr[i][j];

                else {
                    if (varMax < arr[i][j]) {

                        varMax = arr[i][j];

                        idxMax = j;
                    }
                }

                if (j == arr[i].length - 1) {

                    int tmp = arr[i][0];

                    arr[i][0] = arr[i][idxMax];

                    arr[i][idxMax] = tmp;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println();

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + "\t");

            }

        }

    }
}