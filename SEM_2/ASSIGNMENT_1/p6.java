package ASSIGNMENT_1;
import java.util.*;
public class p6 {
    public static boolean isOdd(int n) {
        return ((n & 1) == 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println(n + " is odd : " + isOdd(n));
        sc.close();
    }
}