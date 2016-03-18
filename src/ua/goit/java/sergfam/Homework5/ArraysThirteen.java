package ua.goit.java.sergfam.Homework5;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Serg-fam on 18.03.2016 on 11:34.
 */
public class ArraysThirteen {

    public static void ArrThirteen() {

        int numRand;
        int eventElm = 0;

        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        System.out.print("Enter an integer greater 3:");
        do {
            numRand = in.nextInt();
            if (numRand < 4) {

                System.out.print("Enter an integer again :");
            }
        }
        while (numRand < 4);

        int arr[] = new int[numRand];


        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(numRand);

            System.out.print(arr[i] + " ");

            if ((arr[i] % 2) == 0 && arr[i] != 0) {

                eventElm++;

            }
        }
        System.out.println();


        int arr2[] = new int[eventElm];


        for (int i = 0; i < arr2.length; i++) {

            if ((arr[i] % 2) == 0 && arr[i] != 0) {

                arr2[i] = arr[i];

            }
            // System.out.print(arr2[i]+ " ");
            System.out.print(arr2[i] + " ");
        }
    }


}
