// WAP to find if the entered year is a leap year or not.

package Day_03;

import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("This is a leap year!");
        }
        else {
            System.out.println("This is not a leap year!");
        }
    }
}