// WAP to print a congratulatory message if student’s score is greater than 70 otherwise print a relevant message.

package Day_02;

import java.util.*;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Asking for user to input the score
        System.out.print("Enter the score: ");
        int score = sc.nextInt();

        // If & Else logic and their respective printing statements
        if (score > 70) {

            System.out.println("Congratulations!");
            System.out.println("You're invited to attend the party :)");

        }

        else {

            System.out.println("You could do better!");
            System.out.println("Try working hard the next time for a party :)");

        }
    }
}