// WAP to find greatest of 3 distinct numbers using nested if-else

package Day_02;

import java.util.*;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nThis program is used to find the greatest of three numbers!\n");

        // User inputs for three number
        System.out.print("Enter first number: ");
        int fNum = sc.nextInt();
        System.out.print("Enter second number: ");
        int sNum = sc.nextInt();
        System.out.print("Enter third number: ");
        int tNum = sc.nextInt();

        // Check if First number > Second Number
        if (fNum>sNum) {

            // Check if First number > Third number
            if (fNum>tNum) {
                System.out.println("\nFirst number is greatest");
            }
            else {
                System.out.println("\nThird number is greatest");
            }
        }

        // Check if Second number > First Number
        if (sNum>fNum) {

            // Check if Second number > Third number
            if (sNum>tNum) {
                System.out.println("\nSecond number is greatest");
            }
            else {
                System.out.println("\nThird number is greatest");
            }
        }
    }
}