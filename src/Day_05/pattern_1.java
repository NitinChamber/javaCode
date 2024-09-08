// WAP to print the following patter:
// Pattern 1
//
//N = 5
//
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//
//N = 3
//
//* * *
//* * *
//* * *

package Day_05;

import java.util.*;

public class pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
