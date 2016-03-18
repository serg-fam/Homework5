package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 18.03.2016 on 11:25.
 */
public class ArraysSeven {
    public static void ArrSeven() {

        int arr[] = new int[20];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) arr[i] = 1;
            if (i == 1) arr[i] = 1;
            if (i > 1) arr[i] = arr[i - 1] + arr[i - 2];

            System.out.print(arr[i] + " ");
        }

    }


}

