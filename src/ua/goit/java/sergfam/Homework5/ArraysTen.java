package ua.goit.java.sergfam.Homework5;

import java.util.Random;

/**
 * Created by Serg-fam on 18.03.2016 on 11:30.
 */
public class ArraysTen {

    public static void ArrTen() {

        int i;
        int num1 = 0;
        int num2 = -1;
        int step1 = 0;
        int step2 = 0;

        int arr[] = new int[11];

        Random rand = new Random();

        for (i = 0; i < arr.length; i++) {

            arr[i] = (rand.nextInt(1 + 1) - 1);

            System.out.print(arr[i] + " ");

            System.out.println();
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == num1) {
                step1++;
            } else {
                step2++;
            }
        }
        if (step1 > step2) {
            System.out.print("Element1: " + step1);
        } else
            System.out.print("Element2: " + step2);
    }



}
