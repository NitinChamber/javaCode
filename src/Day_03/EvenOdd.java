// WAP to find if a number is even or odd ?

package Day_03;

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // Check if number is even or odd
        if (num % 2 == 0) {
            System.out.println("This is an even number");
        }
        else {
            System.out.println("This is an odd number");
        }
    }
}