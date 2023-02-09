/*
    Luke Nordheim
    Course: CSC 260
    February 15, 2021
    Assignment: Hw3
    Instructor: Noor
 */

public class Hw3_2 {
    public static void main(String[] args) {
        int rows = 6;
        //pattern A//
        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        //Pattern B//
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        //Pattern C//
        for (int i = 1; i <= 6; i++) {
            for (int j = (i + 1) * 2; j <= 13; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n");

        //Pattern D//
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 6; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


