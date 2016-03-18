package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 18.03.2016 on 11:33.
 */
public class ArraysTwelve {

    public static void ArrTwelve() {

        int a = 0;
        int b = 0;

        int arr[] = new int[12];


        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * 21) - 10;

            if (arr[i] < 0) {
                a++;
            }
            if (arr[i] > 0) {
                b++;
            }

            if (arr[i] == 0 || a > b + 1 || b > a + 1) {

                --i;

                if (a > b + 1) a--;
                if (b > a + 1) b--;
            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

}
