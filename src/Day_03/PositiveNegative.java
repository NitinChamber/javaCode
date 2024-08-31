// WAP to check if a given number is positive, negative, or zero.

package Day_03;

import java.util.*;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // checks if number is positive
        if (number > 0) {
            System.out.println(number + " is a positive number");
        }

        // checks if number is negative
        else if (number < 0) {
            System.out.println(number + " is a negative number");
        }

        // number is o
        else {
            System.out.println(number + " is zero");
        }
    }
}