package ASSIGNMENT_4;
import java.util.*;
public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n>0) {
            int a = n % 10;
            sum = sum + a;
            n = n / 10;
        }
        System.out.println("The sum is " + sum);
        if (sum % 9 == 0) {
            System.out.println("It is divisible by 9");
        } else {
            System.out.println("It is not divisible by 9");
        }

        sc.close();
    }
}
