package ASSIGNMENT_3;

import java.util.*;
public class HW_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        System.out.println("Is " + num + " divisible by 5 and 6 ? " + 
        ((num % 5 == 0) && (num % 6 == 0)));
        System.out.println("Is " + num + " divisible by 5 and 6 ? " +
        ((num % 5 == 0) || (num % 6 == 0)));
        System.out.println("Is " + num + " divisible by 5 and 6, but not both? " + 
        ((num % 5 == 0) ^ (num % 6 == 0)));
        sc.close();
    }
}