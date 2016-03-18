package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 18.03.2016 on 11:28.
 */
public class ArraysEight {

    public static void ArrEight() {

        int max = Integer.MIN_VALUE;
        int i;
        int arr[] = new int[12];

        for (i = 0; i < arr.length; i++) {

            arr[i] = (int) ((Math.random() * 31) - 15);

            System.out.print(arr[i] + " ");

            max = Math.max(arr[i], max);

        }

        System.out.println();

        for (i = 0; i < arr.length; i++) {

            if (arr[i] == max) {


                System.out.println("Max: " + max + " \n" + "Index:" + i);
            }
        }
    }



}
