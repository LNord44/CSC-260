/*
    Luke Nordheim
    Course: CSC 260
    March 24, 2021
    Assignment: HW6
    Instructor: Noor
 */

import java.util.Scanner;

public class ExploreMatrix {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter how large you want the matrix to be:");

        int l = input.nextInt(); //l is our length
        int[][] matrix = new int[l][l]; //this creates our matrix

        randomZeroOneMatrix(matrix); //this method is the one that we fill the matrix with 1's and 0's
        printTwoDArray(matrix); //this method prints off our matrix that we created

        System.out.println(" ");

        //this code below prints off our row check and calls our row check method
        System.out.println("\nRow checks: ");
        int f = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (rowChecks(matrix[i])) {
                System.out.println("All " + matrix[i][0] + "`s on row " + i + ".\n");
                f++;
            }
        }
        if (f == 0) {
            System.out.println("No row has all of the same entries. \n");
        }

        //this code below prints off our column check and calls our column check method
        System.out.println("\nColumn checks: ");
        int e = 0;
        for (int j = 0; j < matrix.length; j++) {
            if (columnChecks(matrix,j)) {
                System.out.println("All " + matrix[0][j] + "`s on column " + j + ".\n");
                e++;
            }
        }
        if (e == 0) {
            System.out.println("No column has all of the same entries. \n");
        }

        //this code below prints off our major diagonal check and calls our diagonal check method
        System.out.println("\nDiagonal check: ");
        for (int j = 0; j < 1; j++) {
            int h = 0;
            if (checkMajorDiagonal(matrix,j)) {
                System.out.println("All " + matrix[0][0] + "`s on major diagonal.\n");
                h++;
            }
            if (h == 0) {
                System.out.println("Not all same numbers on major diagonal \n");
            }
        }

        //this code below prints off our sub diagonal check and calls our sub diagonal check method
        System.out.println("\nSub diagonal check: ");
        for (int j = 0; j < 1; j++) {
            int k = 0;
            if (checkSubDiagonal(matrix,j,l)) {
                System.out.println("All " + matrix[0][l-1] + "`s on sub diagonal.\n");
                k++;
            }
            if (k == 0) {
                System.out.println("Not all same numbers on sub diagonal \n");
            }
        }
    }

    public static int[][] randomZeroOneMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                if (matrix[i][j] < 50) {
                    matrix[i][j] = 0;
                }
                else {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }

    public static void printTwoDArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
        }
    }

    public static boolean rowChecks(int[] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            int x = matrix[0];
            if (x != matrix[i])
                return false;
        }
        return true;
    }

    public static boolean columnChecks(int[][] matrix, int j) {
        for (int i = 1; i < matrix.length; i++) {
            int x = matrix[0][j];
            if (x != matrix[i][j])
                return false;
            }
        return true;
    }

    public static boolean checkMajorDiagonal(int[][] matrix, int j) {
        for (int i = 1; i < matrix.length; i++) {
            int x = matrix[0][0];
            if (x != matrix[i][i])
                return false;
        }
        return true;
    }

    public static boolean checkSubDiagonal(int[][] matrix, int j, int l) {
        int y = 0;
        for (int i = l - 1; i > -1; i--) {
            int x = matrix[y][i];
            if (x != matrix[0][l-1]){
                return false;
            }
            y = y+1;
        }
        return true;
    }
}
