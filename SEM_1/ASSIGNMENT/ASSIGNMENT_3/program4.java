package ASSIGNMENT_3;

import java.util.Random;
import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user Number :");
        int user = sc.nextInt();

        Random Random_number = new Random();
        int guess = Random_number.nextInt(10);
        System.out.println("Computer guesses : " + guess);

        if (guess == user) {
            System.out.println("You got it right");
        } else if (user + 1 == guess | user - 1 == guess) {
            System.out.println("Almost got it");
        } else {
            System.out.println("You got it wrong");
        }

        sc.close();
    }
}