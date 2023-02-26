/*
Write a program that will read the value of n from the user and calculate sum of the following series
*/

package ASSIGNMENT_5;
import java.util.*;
public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i=1 ; i<=n ; i++) {
            double s = 1 / Math.pow(i , 2);
            sum = sum + s;
        }
        System.out.println("The sum is " + sum);
        sc.close();
    }
}
/*
output :

Enter a Number : 5
The sum is 1.4636111111111112

Enter a Number : 10
The sum is 1.5497677311665408

 */