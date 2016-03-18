package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 18.03.2016 on 11:38.
 */
public class ArraysSixteen {

    public static void ArrSixteen() {

        int indPr = 0;
        int maxVal = 0;
        int tmp = 1;

        int arr[][] = new int[7][4];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = (int) (Math.random() * 11 - 5);

                System.out.print(arr[i][j] + "\t");

                tmp = tmp * Math.abs(arr[i][j]);

                if (tmp > indPr) indPr = tmp;
            }
            System.out.println(tmp + " ");
        }
        System.out.println(indPr);
    }

}
