/*
Write a program to print the following patterns: 
5 4 3 2 * 
5 4 3 * 1 
5 4 * 2 1 
5 * 3 2 1 
* 4 3 2 1

*/
package ASSIGNMENT_5;
import java.util.*;
public class HW_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for (int i=1 ; i<=n ; i++) {
            for (int j=n ; j>=1 ; j--) {
                if (i != j) {
                    System.out.print(j + " ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
output :

5 4 3 2 * 
5 4 3 * 1 
5 4 * 2 1 
5 * 3 2 1 
* 4 3 2 1

 */