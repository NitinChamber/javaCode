// Write a Java program to find the sum of the first N natural numbers using a while loop. (Input N from the user)
// (n(n+1))/2

package Day_04;

import java.util.*;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, i = 1;
        while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}