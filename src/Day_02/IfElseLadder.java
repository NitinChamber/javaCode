// WAP to accept an integral input num from the user and print the corresponding statements based on the given
// conditions.
//
// 1. num is divisible by both 5 and 8 → Print 58
// 2. num is only divisible by 5 → Print 5
// 3. num is only divisible by 8 → Print 8
// 4. num is neither divisible by 5 nor by 8 → Print “None”

package Day_02;

import java.util.*;

public class IfElseLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // num is divisible by both 5 and 8 → Print 58
        if (number%5 == 0 && number%8 == 0) {
            System.out.println("58");
        }

        // num is only divisible by 5
        else if (number%5 == 0) {
            System.out.println("5");
        }

        // num is only divisible by 8
        else if (number%8 == 0) {
            System.out.println("8");
        }

        // num is neither divisible by 5 nor by 8
        else {
            System.out.println("None");
        }
    }
}