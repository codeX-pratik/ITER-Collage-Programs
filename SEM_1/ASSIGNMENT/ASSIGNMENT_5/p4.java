/*
WAP to calculate and display the factorial of all numbers between m and n (where m < n, m > 0, n > 0) 
 */

 package ASSIGNMENT_5;
 import java.util.*;
 public class p4 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter 1st Number : ");
         int n1 = sc.nextInt();
         System.out.print("Enter 2st Number : ");
         int n2 = sc.nextInt();
         
         for (int i=n1 ; i<=n2 ; i++) {
             int f = 1;
             for (int j=i ; j>=1 ; j--) {
                 f = f * j;
             }
             System.out.println("Fatorial of " + i + " is " + f);
         }
         sc.close();
     }
 }
 
/*
Enter 1st Number : 2
Enter 2st Number : 5
Fatorial of 2 is 2
Fatorial of 3 is 6
Fatorial of 4 is 24
Fatorial of 5 is 120

 */