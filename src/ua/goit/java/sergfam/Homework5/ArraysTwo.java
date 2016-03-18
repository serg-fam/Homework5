package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 17.03.2016 on 11:58.
 */
public class ArraysTwo {

    public static void ArrTwo() {


        int arr[] = new int[50];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = ((i * 2) + 1);

            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");
        }
    }
}
