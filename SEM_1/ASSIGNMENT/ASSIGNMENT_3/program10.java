package ASSIGNMENT_3;

import java.util.Scanner;
public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you marks : ");
        int mark = sc.nextInt();
        String grade = null;

        switch (mark/10) {
            case 9 : grade = "O";
            break;
            case 8 : grade = "A";
            break;
            case 7 : grade = "B";
            break;
            case 6 : grade = "c";
            break;
            case 5 : grade = "D";
            break;
            case 4 : grade = "E";
            break;
            default : grade = "F";
            break;
        }
        System.out.println("Your grade is " + grade);

        sc.close();
    }
}