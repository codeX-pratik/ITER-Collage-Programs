package ASSIGNMENT_3;

import java.util.Scanner;
public class HW_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter today's date : ");
    int date = sc.nextInt();
    System.out.print("Enter the number of days elapsed since today : ");
    int elapsed = sc.nextInt();

    int future_day = (date + elapsed) % 7;
    String date_of_week_1 = null;
    String date_of_week_2 = null;

    switch (date) {
        case 0 : date_of_week_1 = "Sunday";
        break;
        case 1 : date_of_week_1 = "Monday";
        break;
        case 2 : date_of_week_1 = "Tuesday";
        break;
        case 3 : date_of_week_1 = "Wednesday";
        break;
        case 4 : date_of_week_1 = "Thursday";
        break;
        case 5 : date_of_week_1 = "Friday";
        break;
        case 6 : date_of_week_1 = "Saturday";
        break;
    }

    switch (future_day) {
        case 0 : date_of_week_2 = "Sunday";
        break;
        case 1 : date_of_week_2 = "Monday";
        break;
        case 2 : date_of_week_2 = "Tuesday";
        break;
        case 3 : date_of_week_2 = "Wednesday";
        break;
        case 4 : date_of_week_2 = "Thursday";
        break;
        case 5 : date_of_week_2 = "Friday";
        break;
        case 6 : date_of_week_2 = "Saturday";
        break;
    }

    System.out.println("Today is " + date_of_week_1 + " the future day is " + date_of_week_2);
    sc.close();
    }
}