package ASSIGNMENT_4;
import java.util.*;
public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 1;
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        while (3*p <= n) {
            p = p * 3;
        }
        System.out.println("The largest power of 3 less than or equal to " + n + " is " + p);
        sc.close();
    }
}