package ASSIGNMENT_3;

import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st Number :");
        int first = sc.nextInt();
        System.out.print("Enter your 2nd Number :");
        int second = sc.nextInt();
        System.out.print("Enter your 3rd Number :");
        int third = sc.nextInt();

        if (first < second && second < third) {
            System.out.println("Increasing");
        } else if (first > second && second > third) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither Increasing and Decreasing");
        }


        sc.close();
    }
}