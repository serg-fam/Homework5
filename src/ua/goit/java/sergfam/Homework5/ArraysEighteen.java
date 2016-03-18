package ua.goit.java.sergfam.Homework5;

/**
 * Created by Serg-fam on 17.03.2016 on 11:34.
 */
public class ArraysEighteen {

    public static void ArrEighteen() {

        System.out.println("18. Для проверки остаточных знаний учеников после летних каникул,\n " +
                " учитель младших классов решил начинать каждый урок с того, \n" +
                "чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек,\n" +
                " а примеры среди них не должны повторяться. \n" +
                "В помощь учителю напишите программу, которая будет выводить на экран:\n" +
                " 15 случайных примеров из таблицы умножения \n" +
                " (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).\n" +
                " При этом среди 15 примеров не должно быть повторяющихся \n" +
                "(примеры 2*3 и 3*2 и им подобные пары считать повторяющимися.");

        int arr[][] = new int[15][3];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = (int) (Math.random() * 8) + 2;

                if (j == arr[i].length - 1) {

                    arr[i][j] = arr[i][j - 2] * arr[i][j - 1];

                    for (int k = 0; k < i; k++) {

                        if (arr[i][j] == arr[k][j] && i > 0) {

                            if (arr[i][j - 1] == arr[k][j - 1] || arr[i][j - 2] == arr[k][j - 2])

                                --i;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Task №" + (i + 1 + " Multiply "));

            for (int j = 0; j < arr[i].length; j++) {

                if (j == 0)

                    System.out.print(arr[i][j] + " on ");

                if (j == 1)

                    System.out.println(arr[i][j]);
            }
        }
    

    }
}
