package ASSIGNMENT_3;

import java.util.Random;
import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random_number = new Random();

        String play = null;
        String c_play = null;

        System.out.print("scissor (0) , rock (1) , paper (2) : ");
        int user = sc.nextInt();

        int Computer = random_number.nextInt(3);
        if (Computer == 0) {
            c_play = "scissor";
        } else if (Computer == 1) {
            c_play = "rock";
        } else if (Computer == 2) {
            c_play = "paper";
        }
        
        
        switch (Computer) {
            case 0 : if (user == 0) {
                play = "You are scissor. it is a draw";
            } else if (user == 1) {
                play = "You are rock. you won";
            } else if (user == 2) {
                play = "You are paper. you lose";
            }
            break;
            case 1 : if (user == 0) {
                play = "You are scissor. you lose";
            } else if (user == 1) {
                play = "You are rock. it is a draw";
            } else if (user == 2) {
                play = "You are paper. you won";
            }
            break;
            case 2 : if (user == 0) {
                play = "You are scissor. you won";
            } else if (user == 1) {
                play = "You are rock. you lose";
            } else if (user == 2) {
                play = "You are paper. it is a draw";
            }
            break;
        }
        System.out.println("computer is " + c_play + ". " + play);
        sc.close();
    }
}