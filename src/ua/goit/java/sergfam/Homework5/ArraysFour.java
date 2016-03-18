package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 18.03.2016 on 11:21.
 */
public class ArraysFour {

    public static void ArrFour() {

        int arr[] = new int[8];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) ((Math.random() * 10 + 1));
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {

                arr[i] = 0;

            }

            System.out.print(arr[i] + " ");
        }
    }
}
