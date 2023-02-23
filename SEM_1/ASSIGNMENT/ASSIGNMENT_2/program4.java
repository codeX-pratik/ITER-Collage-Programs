

import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.print("Enter a Number between 0 and 1000 : ");
        int num = sc.nextInt();
        int R1 , R2 , R3 , Q1 , Q2 ;

        R1 = num % 10;
        Q1 = num / 10;
        R2 = Q1 % 10;
        Q2 = Q1 / 10;
        R3 = Q2 % 10;
        

        int sum = R1 + R2 + R3;
        System.out.println("The sum of the digits is " + sum);
        sc.close();
    }
}
