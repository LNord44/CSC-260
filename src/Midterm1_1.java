/*
    Luke Nordheim
    Course: CSC 260
    February 27, 2021
    Assignment: Midterm
    Instructor: Noor
 */

import java.util.Scanner;

public class Midterm1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = input.nextLine();

        for (int i = 0; i < name.length(); ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(name.charAt(j) + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for(int i = 0; i < name.length(); ++i) {
            for (int j = (i + 1) * 2; j < name.length() + name.length(); j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (i + 1); ++j) {
                System.out.print(name.charAt(j) + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
/*
Enter your name
NORDHEIM
N
N O
N O R
N O R D
N O R D H
N O R D H E
N O R D H E I
N O R D H E I M


              N
            N O
          N O R
        N O R D
      N O R D H
    N O R D H E
  N O R D H E I
N O R D H E I M
 */