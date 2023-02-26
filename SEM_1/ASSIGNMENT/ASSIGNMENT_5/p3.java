/*
WAP to enter the first number and second number. Display the prime numbers between the first and second number
 */

 package ASSIGNMENT_5;
 import java.util.*;
 public class p3 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter 1st Number : ");
         int n1 = sc.nextInt();
         System.out.print("Enter 2nd Number : ");
         int n2 = sc.nextInt();
         System.out.print("Prime numbers between " + n1 + " and " + n2 + " are : ");
         int f = 0;
         for (int i=n1 ; i<=n2 ; i++) {
             for (int j=2 ; j<i ; j++) {
                 if (i % j == 0) {
                     f = 0;
                     break;
                } else {
                    f = 1;
                }
            }
            if (f == 1) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
    
 /*
 output :
Enter 1st Number : 4
Enter 2nd Number : 15
Prime numbers between 4 and 15 are : 5 7 11 13

  */