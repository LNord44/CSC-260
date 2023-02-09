import java.util.ArrayList;
import java.util.Scanner;

public class GradesCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = 90, B = 80, C = 70, D = 60;
        ArrayList<Integer> aGrades = new ArrayList<Integer>();
        ArrayList<Integer> bGrades = new ArrayList<Integer>();
        ArrayList<Integer> cGrades = new ArrayList<Integer>();
        ArrayList<Integer> dGrades = new ArrayList<Integer>();
        ArrayList<Integer> fGrades = new ArrayList<Integer>();

        int count = 0;

        System.out.println("Please enter a grade between 0 to 100 or -1 to quit:");
        int grade = input.nextInt();
        while(grade != -1) {
            if (grade >= A) {
                aGrades.add(grade);
            } else if (grade >= B) {
                bGrades.add(grade);
            } else if (grade >= C) {
                cGrades.add(grade);
            } else if (grade >= D) {
                dGrades.add(grade);
            } else {
                fGrades.add(grade);
            }
            System.out.println("Please enter a grade between 0 to 100 or -1 to quit:");
            grade = input.nextInt();
            count++;
        }
        System.out.println("Total number of grades = " + count);
        System.out.println("Number of A = " + aGrades.size());
        System.out.println("Number of B = " + bGrades.size());
        System.out.println("Number of C = " + cGrades.size());
        System.out.println("Number of D = " + dGrades.size());
        System.out.println("Number of F = " + fGrades.size());
        System.out.println("The A grades are: " + aGrades);
    }
}
