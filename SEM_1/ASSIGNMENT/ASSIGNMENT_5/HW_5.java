/*
Write a java program to generate and print the first n terms of the Fibonacci sequence where n>=1. 
The first few terms are: 0, 1, 1, 2, 3, 5, 8, 13, ...... 
Each term beyond the first two is derived from the sum of its two nearest predecessors i.e. a new term in the series (Except the first two) is found by the following formula

*/

package ASSIGNMENT_5;
import java.util.*;
public class HW_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = 0 , b =1 , sum = 0;
        System.out.print("if n = " + n + " it will display as: Fibonacci Series is : ");
        for (int i=1 ; i<=n ; i++) {
            System.out.print(sum + " ");
            a = b;
            b = sum;
            sum = a + b;
        }
        sc.close();
    }
}

/*
output :

Enter a number : 1
if n = 1 it will display as: Fibonacci Series is : 0

Enter a number : 2
if n = 2 it will display as: Fibonacci Series is : 0 1

Enter a number : 3
if n = 3 it will display as: Fibonacci Series is : 0 1 1

Enter a number : 10
if n = 10 it will display as: Fibonacci Series is : 0 1 1 2 3 5 8 13 21 34

 */