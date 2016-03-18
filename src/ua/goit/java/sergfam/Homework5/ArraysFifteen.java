package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 18.03.2016 on 11:36.
 */
public class ArraysFifteen {

    public static void ArrFifteen () {

        int max = 0;
        int arr[][] = new int[5][8];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                arr[i][j] = (int) (Math.random() * 199 - 99);

                System.out.print(arr[i][j] + "\t");

                if (arr[i][j] > max) max = arr[i][j];
            }
            System.out.println();
        }

        System.out.print(max);
    }

}
