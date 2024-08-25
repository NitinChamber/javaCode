package Day_01;

import java.util.Scanner;

public class Addition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int fNum = sc.nextInt();

        System.out.print("Enter second integer: ");
        int sNum = sc.nextInt();

        int sum = fNum + sNum;
        System.out.println("Sum of both integers = " + sum);
    }
}