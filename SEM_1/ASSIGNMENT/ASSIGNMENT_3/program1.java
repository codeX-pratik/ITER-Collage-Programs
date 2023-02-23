package ASSIGNMENT_3;

import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to cast your vote");
        } else {
            System.out.println("You are not eligible");
        }


        sc.close();
    }
}
