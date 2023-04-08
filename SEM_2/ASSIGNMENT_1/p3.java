package ASSIGNMENT_1;
import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int x = n;
        int sum = 0;
        int pro = 1;
        while (n != 0) {
            int r = n % 10;
            sum += r;
            pro *= r;
            n /= 10;
        }
        if (sum == pro) {
            System.out.println(x + " is a spy Number");
        } else {
            System.out.println(x + " is not a spy Number");
        }
        sc.close();
    }
}
