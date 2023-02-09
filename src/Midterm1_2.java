/*
    Luke Nordheim
    Course: CSC 260
    February 27, 2021
    Assignment: Midterm
    Instructor: Noor
 */

import java.util.Scanner;


public class Midterm1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string ");
        String firstString = input.nextLine();
        System.out.println("Enter the second string ");
        String secondString = input.nextLine();
        int sum;
        int maxSum = 0;

        if (!(firstString.length() == secondString.length())) {
            System.out.println("The lengths of the strings do not match ");
        }
        else {
            for (int i = 0; i < secondString.length(); i++) {
                sum = Character.getNumericValue(firstString.charAt(i)) + Character.getNumericValue(secondString.charAt(i));
                if (Character.isLetter(firstString.charAt(i)) || Character.isLetter(secondString.charAt(i))) {
                    System.out.println("Largest digit sum is not possible ");
                    System.exit(0);
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("The largest digit sum is " + maxSum);
        input.close();
    }
}
/*
Enter the first string
12323123102195
Enter the second string
25674324683872
The largest digit sum is 16

Enter the first string
2adg3345
Enter the second string
12345678
Largest digit sum is not possible

Enter the first string
1234
Enter the second string
abcd
Largest digit sum is not possible
 */