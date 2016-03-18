package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 18.03.2016 on 11:24.
 */
public class ArraysSix {


    public static void ArrSix() {

        int arr[] = new int[4];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) ((Math.random() * 90 + 10));
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {

            if (i > 0) {
                if (arr[i - 1] >= arr[i]) {

                    System.out.println("Array is no ascending ");

                    break;
                }
            }
            if (i == arr.length - 1) {

                System.out.println("Array is ascending ");

            }
        }

    }



}
