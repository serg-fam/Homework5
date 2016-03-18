package ua.goit.java.sergfam.Homework5;

import java.util.Scanner;

/**
 * Created by Serg-fam on 17.03.2016 on 10:36.
 */
public class MyArraysSort {

    // public static int method;

    public static void main(String[] args) {

        System.out.print("Test Number 1 to 18 :");

        Scanner n = new Scanner(System.in);

        int method = n.nextInt();

        switch (method) {

            case 1:

                ArraysOne.ArrOne();
                break;
            case 2:
                ArraysTwo.ArrTwo ();
                break;
            case 3:
                ArrayThree.ArrThree();
                break;
            case 4 :
                ArraysFour.ArrFour();
                break;
            case 5:
                ArraysFive.ArrFive();
                break;
            case 6:
                ArraysSix.ArrSix();
                break;
            case 7:
                ArraysSeven.ArrSeven();
                break;
            case 8:
                ArraysEight.ArrEight();
                break;
            case 9:
                ArraysNine.ArrNine();
                break;
            case 10:
               ArraysTen.ArrTen();
                break;
            case 11:
                ArraysEleven.ArrEleven();
                break;
            case 12:
              ArraysTwelve.ArrTwelve();
                break;
            case 13:
               ArraysThirteen.ArrThirteen();
                break;
            case 14:
                ArraysFourteen.ArrFourteen();
                break;
            case 15:
                ArraysFifteen.ArrFifteen();
                break;
            case 16:
               ArraysSixteen.ArrSixteen();
                break;
            case 17:
                ArraysSeventeen.ArrSeventeen();
                break;
            case 18:
               ArraysEighteen.ArrEighteen();
                break;
            default:
                System.err.println("Invalid number of test");
        }
    }

}


