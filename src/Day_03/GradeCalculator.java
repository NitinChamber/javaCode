// Write a program that takes a score (0-100) as input and prints the corresponding grade based on the following criteria:
//
// 90-100: "A"
// 80-89: "B"
// 70-79: "C"
// 60-69: "D"
// Below 60: "F"

package Day_03;

import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("Your grade is A.");
        }
        else if (score >= 80 && score <= 89) {
            System.out.println("Your grade is B.");
        }
        else if (score >= 70 && score <= 79) {
            System.out.println("Your grade is C.");
        }
        else if (score >= 60 && score <= 69) {
            System.out.println("Your grade is D.");
        }
        else {
            System.out.println("Your grade is F.");
        }
    }
}