/*
    Luke Nordheim
    Course: CSC 260
    March 14, 2021
    Assignment: Hw5
    Instructor: Noor
 */

import java.util.Scanner;

public class Hw5_2 {
    public static void main(String[] args) {
        // I declare the scanner and get my inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        int five = scanner.nextInt();
        int six = scanner.nextInt();
        int seven = scanner.nextInt();
        int eight = scanner.nextInt();
        int nine = scanner.nextInt();
        int ten = scanner.nextInt();
        // I create the array and fill it with my integers
        int[] intArray = {one, two, three, four, five, six, seven, eight, nine, ten};
        System.out.println("The reversal of the input is");
        // I use this while loop to reverse the array
        int counter = 9;
        while (counter != -1) {
            System.out.print(intArray[counter] + " ");
            counter -= 1;
        }
        scanner.close();
    }
}