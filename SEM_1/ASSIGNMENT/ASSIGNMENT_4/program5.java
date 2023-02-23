package ASSIGNMENT_4;
import java.util.*;
public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1 ; i<n ; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("Given number is perfect");
        } else {
            System.out.println("Given number is not perfect");
        }
        sc.close();
    }
}
