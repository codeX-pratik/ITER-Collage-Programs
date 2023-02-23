package ASSIGNMENT_6;
import java.util.*;
public class p3 {
    public static int reverse (int n) {
        int rev = 0;
        while (n != 0) {
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }
        return rev;
    }
    public static boolean isPalindrome(int n) {
        int rev_num = reverse(n);
        return n == rev_num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome Number");
        } else {
            System.out.println(n + " is not a palindrome Number");
        }
        sc.close();
    }
}
