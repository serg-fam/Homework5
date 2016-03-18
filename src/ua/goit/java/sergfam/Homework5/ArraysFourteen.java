package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 18.03.2016 on 11:35.
 */
public class ArraysFourteen {

    public static void ArrFourteen() {

        int arr[][] = new int[8][5];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = (int) (Math.random() * 90 + 10);

                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
