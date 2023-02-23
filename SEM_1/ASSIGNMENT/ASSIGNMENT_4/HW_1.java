package ASSIGNMENT_4;
import java.util.*;
public class HW_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a Number : ");
        int n = sc.nextInt();
        int t = n;
        int sum1 = 0;
        int sum2 = 0;
        while (n > 0) {
            int p = (int)(Math.pow(n , 2));
            sum1 = sum1 + p;
            n--;
        }
        while (t > 0) {
            sum2 = sum2 + t;
            t--;
        }
        int d = (int)Math.pow(sum2,2) - sum1 ;
        System.out.println("Hence the difference between the sum of the square of the first ten natural number and the square of the sum is " + (int)Math.pow(sum2,2) + " - " + sum1 + " = " + d);
        sc.close();
    }
}