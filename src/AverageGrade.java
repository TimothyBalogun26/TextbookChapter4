/**
 * @class: AverageGrade
 * @author: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: February 25, 2023
 * @description: This program prompts the user for student grades, calculates and displays the average grade in the class.
 */

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // The integer 0 is used as a placeholder to determine the min for integer
        double sum = 0;
        int count = 0;
// boolean evaluation to determine if sequence is true or false
        while (true) {
            System.out.print("Enter a grade (or enter 'Q' to quit): ");
            String grade = input.nextLine();
// boolean evaluation to ignore case controls
            if (grade.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double gradeValue = Double.parseDouble(grade);
                sum += gradeValue;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'Q' to quit.");
            }
        }
// boolean evaluation to determine if count is less than 0 to then prompt the sequence below
        if (count > 0) {
            double average = sum / count;
            System.out.println("The average grade is: " + average);
        } else {
            System.out.println("No grades were entered.");
        }
    }
}
