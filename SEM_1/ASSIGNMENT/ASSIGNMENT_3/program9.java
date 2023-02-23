package ASSIGNMENT_3;

import java.util.Scanner;
public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a , b , c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("The largest Number is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The largest Number is " + b);
        } else {
            System.out.println("The largest Number is " + c);
        }

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("The second largest Number is " + b);
            } else {
                System.out.println("The second largest Number is " + c);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("The second largest Number is " + a);
            } else {
                System.out.println("The second largest Number is " + c);
            }
        } else if (a > b) {
            System.out.println("The second largest Number is " + a);
        } else {
            System.out.println("The second largest Number is " + b);
        }

        sc.close();
    }
}