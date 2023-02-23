package ASSIGNMENT_3;

import java.util.Scanner;
public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x , y;
        System.out.print("Enter the value for x :");
        x = sc.nextDouble();
        System.out.print("Enter the value for y :");
        y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("lies in first Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("lies in second Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("lies in third Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("lies in fourth Quadrant");
        } else if (x == 0 && y > 0) {
            System.out.println("lies if positive y axis");
        } else if (x == 0 && y < 0) {
            System.out.println("lies in negative y axis");
        } else if (x > 0 && y == 0) {
            System.out.println("lies if positive x axis");
        } else if (x < 0 && y == 0) {
            System.out.println("lies in negative x axis");
        } else if (x == 0 && y == 0) {
            System.out.println("lies in origin");
        }

        sc.close();
    }
}