package BASIC_PROGRAM;
import java.util.*;
public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("This is a leap year.");
        } else {
            System.out.println("This is not a leap year.");
        }

        sc.close();
    }
}
/*
Enter the year : 2023
This is not a leap year.

Enter the year : 2024
This is a leap year.
*/