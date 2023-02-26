/*
Given a=0, b=1 and c=1 are the first three numbers of some sequence. All other numbers in the sequence are generated from the sum of their three most recent predecessors. Write a java program to generate this sequence up to n terms where n > 3.
 */


package ASSIGNMENT_5;
import java.util.*;
public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int a = 0 , b = 1 , c = 1;
        System.out.print(a + " " + b + " " + c + " ");
        for (int i=3 ; i<=n ; i++) {
            int sum = a + b + c;
            System.out.print(sum + " ");
            a = b;
            b = c;
            c = sum;
        }
        sc.close();
    }
}

/*
output :

Enter a Number : 5
0 1 1 2 4 7

Enter a Number : 10
0 1 1 2 4 7 13 24 44 81 149

 */