/*
WAP to enter the value of n and display find the following sum of the series: 
1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)

 */

package ASSIGNMENT_5;
import java.util.*;
public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1 ; i<=n ; i++) {
            for (int j=1 ; j<=i ; j++) {
                sum = sum + j;
            }
        }
        System.out.println("The sum is " + sum);
        sc.close();
    }
}    

/*
output :

Enter a Number : 5
The sum is 35


 */