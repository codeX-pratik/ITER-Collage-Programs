/*
WAP to check whether a number is twisted prime or not. Twisted prime is a number if the number and its reverse both are prime then it is called twisted prime. 
 */

 package ASSIGNMENT_5;
 import java.util.*;
 public class p2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : " );
        int n = sc.nextInt();
        int n1 = n;
        int t = 0;
        int t1 = 0;
         
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
 
        for (int i=2 ; i<n ; i++) {
            if (n % i == 0) {
                t++;
            }
        }
        for (int i=2 ; i<rev ; i++) {
            if (rev % i == 0) {
                t1++;
            }
        }
        
        if ((t > 0) || (t1 > 0)) {
            System.out.println(n1 + " is not Twisted prime");
        } else {
            System.out.println(n1 + " is Twisted prime");
        }
        sc.close();
    }
}
/*
output : 

Enter a Number : 97
97 is Twisted prime

Enter a Number : 43
43 is not Twisted prime

 */
 