// WAP to print the following patter:
// Pattern 2
//
//N = 5
//
//* -> i = 0 -> 1 column
//* * -> i = 1 -> 2 columns
//* * * -> i = 2 -> 3 columns
//* * * * -> i = 3 -> 4 columns
//* * * * * -> i = 4 -> 5 columns
//
//N = 3
//
//*
//* *
//* * *

package Day_05;

import java.util.*;

public class pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < i + 1; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
