/*
    Luke Nordheim
    Course: CSC 260
    March 14, 2021
    Assignment: Hw5
    Instructor: Noor
 */


import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;


public class Hw5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // I declare scanner and list
        System.out.println("Enter 10 numbers: ");
        double[] list = new double[10];
        // this loop is used to get the inputs
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        input.close();

        Map<Integer, Integer> dictionary = new HashMap<>();
        //create dictionary hashmap

        for (int i = 0; i < list.length; i++) {
            if (((Map<Integer, Integer>) dictionary).containsKey(list[i])){
                dictionary.put((int) list[i], dictionary.get(list[i]) + 1);
            }
            else {
                dictionary.put((int) list[i], 1);
            }

        }
        //this for loop occupies my dictionary with new occurrences and doesn't input recurring numbers

        System.out.println("The number of distinct integers is " + dictionary.size());
        System.out.println("The distinct intergers are " + dictionary.keySet());

    }

}
