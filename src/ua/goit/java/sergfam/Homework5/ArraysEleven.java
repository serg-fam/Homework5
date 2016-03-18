package ua.goit.java.sergfam.Homework5;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Serg-fam on 18.03.2016 on 11:32.
 */
public class ArraysEleven {

    public static void ArrEleven() {

        int sum1 = 0;
        int sum2 = 0;
        int numRand;

        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        System.out.print("Keep a positive even integer  :");

        do {
            numRand = in.nextInt();
            if (numRand % 2 != 0 || numRand < 1) ;

            System.out.print("Keep a positive even number again :");
        }
        while (numRand % 2 != 0 || numRand < 1);

        int arr[] = new int[numRand];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (rand.nextInt(11) - 5);

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += Math.abs(arr[i]);
        }
        System.out.print("sum1: " + sum1);

        System.out.println();

        for (int i = arr.length / 2; i <= arr.length - 1; i++) {
            sum2 += Math.abs(arr[i]);
        }
        System.out.print("sum2: " + sum2);

        System.out.println();

        if (sum1 > sum2) {
            System.out.print("Sum1 > Sum2");
        } else if (sum1 < sum2) {
            System.out.print("Sum1 < Sum2");
        } else if (sum1 == sum2) {
            System.out.print("Sum1 = Sum2");
        }
    }



}
