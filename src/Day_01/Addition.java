// Program to add two integers.

package Day_01;

import java.util.Scanner;

public class Addition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // User input for first number
        System.out.print("Enter first integer: ");
        int fNum = sc.nextInt();

        // User input for second number
        System.out.print("Enter second integer: ");
        int sNum = sc.nextInt();

        // Adding both numbers and printing the output
        int sum = fNum + sNum;
        System.out.println("Sum of both integers = " + sum);
    }
}