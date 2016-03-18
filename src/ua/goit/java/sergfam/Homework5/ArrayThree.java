package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 17.03.2016 on 12:02.
 */
public class ArrayThree {

    public static void ArrThree() {


        int arr[] = new int[15];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) ((Math.random() * 10));
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                System.out.print(arr[i] + " ");
            }
        }
    }
}
