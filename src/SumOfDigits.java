/**
 * @class: SumOfDigits
 * @author: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: February 25, 2023
 * @description: In this section I will write a program that accepts an integer from the user and displays the sum of the
  digits of the provided integer.
 */

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // This will prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        //allows the user to enter an integer with min being 0
        int num = input.nextInt();
        int sum = 0;
       // a boolean evaluation to help determine whether num follows each true or false sequence
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
