/**
 * @class: PrimeNumbers
 * @author: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: February 25, 2023
 * @description: This program prompts the user for an integer and displays if the provided integer is a prime number or not.
 */


import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        // prompts the user to enter an integer
        int num = input.nextInt();
        // boolean evaluation to determine if sequence is true or false
        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
            // If sequence is false user will be prompted with the code below
        } else {
            for (int i = 2; i <= (num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

    }
}
