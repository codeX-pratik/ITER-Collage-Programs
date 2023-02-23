package ASSIGNMENT_3;

import java.util.*;
public class HW_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your gender (m or f) : ");
        String gender = sc.next();
        System.out.print("Enter your first name : ");
        String first_name = sc.next();
        System.out.print("Enter your last name : ");
        String  last_name = sc.next();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        

        if (gender.equals("f")) {
            if (age >= 20) {
                System.out.print("Are you married, " + first_name + " (y or no) ?");
                String ans = sc.next();
                if (ans.equals("y")) {
                    System.out.println("Then I shall call you Mrs. " + first_name + " " + last_name); 
                } else if (ans.equals("n")) {
                    System.out.println("Then I shall call you Ms. " + first_name + " " + last_name);
                }
            } else if (age < 20) {
                System.out.println("Then I shall call you " + first_name + " " + last_name);
            }
        } else if (gender.equals("m")) {
            if (age >= 20) {
                System.out.println("Then I shall call you Mr. " + first_name + " " + last_name);
            } else if  (age < 20) {
                System.out.println("Then I shall call you " + first_name + " " + last_name);
            }
        }
        sc.close();
    }
}