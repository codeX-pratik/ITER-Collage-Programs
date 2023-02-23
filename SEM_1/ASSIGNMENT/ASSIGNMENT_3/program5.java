package ASSIGNMENT_3;

import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year you want to check : ");
        int year = sc.nextInt();
        
        if (year % 4 == 0) {
            System.out.println(year + " This is a leap year");
        } else {
            System.out.println(year + " This is not a leap year");
        }
        sc.close();
    }
}