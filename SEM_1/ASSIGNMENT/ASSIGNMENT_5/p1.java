/*
Amicable numbers are pair of numbers each of whose divisors are added to give the other number. 
Example: The smallest pair of amicable numbers is (220, 284). 
They are amicable because the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110, of which the sum is 284; and the proper divisors of 284 are 1, 2, 4, 71 and 142, of which the sum is 220. 
Note: 1 is included as a divisor but the numbers are not included as their own divisors. 
Write a java program that tests whether a given pair of numbers is amicable numbers or not.

 */
package ASSIGNMENT_5;
import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2st Number : ");
        int n2 = sc.nextInt();
        int sum = 0;
        int sum1 = 0;
        for (int i=1 ; i<n1 ; i++) {
            if (n1 % i == 0) {
                sum = sum + i;
            }
        }
        for (int i=1 ; i<n2 ; i++) {
            if (n2 % i == 0) {
                sum1 = sum1 + i;
            }
        }
        if ((n1 == sum1) && (n2 == sum)) {
            System.out.println(n1 + " and " + n2 + " are Amicable Number");
        } else {
            System.out.println(n1 + " and " + n2 + " are not Amicable Number");
        }
        sc.close();
    }
}

/*
output : 

Enter 1st Number : 220
Enter 2st Number : 284
220 and 284 are Amicable Number

Enter 1st Number : 220
Enter 2st Number : 230
220 and 230 are not Amicable Number

 */