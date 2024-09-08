// WAP to print the following patter:
// Pattern 3
//
//N = 5
//
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//
//N = 3
//
//1
//1 2
//1 2 3

package Day_05;

import java.util.*;

public class pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j < i + 1; j++)
                System.out.print(j);
            System.out.println("");
        }
    }
}
