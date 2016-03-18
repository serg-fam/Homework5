package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 18.03.2016 on 11:29.
 */
public class ArraysNine {

    public static void ArrNine() {

        int i;
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        float arr3[] = new float[10];

        for (i = 0; i < arr1.length; i++) {

            arr1[i] = (int) (1 + Math.random() * 9);

            System.out.print(arr1[i] + " ");

        }

        System.out.println();

        for (i = 0; i < arr1.length; i++) {

            arr2[i] = (int) (1 + Math.random() * 9);

            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        for (i = 0; i < arr3.length; i++) {

            arr3[i] = (float) (arr1[i] / arr2[i]);

            System.out.print(arr3[i] + " ");
        }

        System.out.println();

        for (i = 0; i < arr3.length; i++) {

            System.out.print(((int) (arr3[i])) + " ");
        }
    }



}
