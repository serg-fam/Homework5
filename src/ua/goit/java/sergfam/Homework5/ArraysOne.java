package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 17.03.2016 on 11:26.
 */
public class ArraysOne {


    public static void ArrOne   () {


        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = ((i + 1) * 2);

            System.out.print(arr[i] + " ");

        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print("\n" + arr[i]);
        }

    }
}
