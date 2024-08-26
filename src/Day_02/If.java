// Program to print a congratulatory message if student’s score is greater than 70.

package Day_02;

import java.util.*;

public class If {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input to enter score
        System.out.print("Enter you score: ");
        int score = sc.nextInt();

        // If logic and printing the message
        if (score > 70) {

            System.out.println("Congratulation!!");
            System.out.println("You're invited to join us for a Party!!!");

        }
    }
}