package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 18.03.2016 on 11:23.
 */
public class ArraysFive {

    public static void ArrFive() {

        int sum1 = 0;
        int sum2 = 0;
        double average1;
        double average2;

        int arr1[] = new int[5];
        int arr2[] = new int[5];

        for (int i = 0; i < arr1.length; i++) {

            arr1[i] = (int) ((Math.random() * 6));

            System.out.print(arr1[i] + " ");

            sum1 += arr1[i];

        }

        System.out.println();

        for (int i = 0; i < arr2.length; i++) {

            arr2[i] = (int) ((Math.random() * 6));

            System.out.print(arr2[i] + " ");
            sum2 += arr2[i];
        }
        System.out.println();
        average1 = (double) sum1 / (double) arr1.length;
        average2 = (double) sum2 / (double) arr2.length;

        System.out.println("average1:" + " " + average1);
        System.out.println("average2:" + " " + average2);

        if (average1 == average2) {
            System.out.println("average1=average2");
        } else if (average1 < average2) {

            System.out.println("average1 < average2");
        } else if (average1 > average2) {
            System.out.println("average1 > average2");
        }
    }

}
