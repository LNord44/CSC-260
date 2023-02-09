/*
    Luke Nordheim
    Course: CSC 260
    February 15, 2021
    Assignment: Hw3
    Instructor: Noor
 */

import java.util.Scanner;

public class Hw3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        System.out.print("The prime factors for " + number + " are\n");

        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }
        if (number > 2) {
            System.out.println(number); }
        else if (number < 2) {
            System.out.println("Number has no prime factors");
        }
    }
}