package ASSIGNMENT_1;
import java.util.Scanner;
public class p5 {
    public static int sum_of_Digits(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int sum = sum_of_Digits(n);

        while (sum >= 9) {
            sum = sum_of_Digits(sum);
        }
        System.out.println("sum od digit of " + n + " until the number is a single digit is " + sum);
        sc.close();
    }
}