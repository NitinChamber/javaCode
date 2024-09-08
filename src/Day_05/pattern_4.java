// WAP to print the following patter:
// Pattern 4
//
//N = 5
//
//1 -> i = 0
//2 2 -> i = 1
//3 3 3 -> i = 2
//4 4 4 4 -> i = 3
//5 5 5 5 5

package Day_05;

import java.util.*;

public class pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print(i + 1);
            System.out.println("");
        }
    }
}
