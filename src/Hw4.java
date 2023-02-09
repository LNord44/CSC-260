/*
    Luke Nordheim
    Course: CSC 260
    February 26, 2021
    Assignment: HW4
    Instructor: Noor
 */

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num1 = input.nextInt();
        int num2 = 0;
        reverse(num1, num2);
        input.close();
        }

    public static int reverse(int num1, int num2) {
        for (; num1 != 0; num1 /= 10) {
            int num3 = num1 % 10;
            num2 = num2 * 10 + num3;
        }
        System.out.println(num2);
        return num2;
    }
}
/*
Enter an integer:
234
432
 */