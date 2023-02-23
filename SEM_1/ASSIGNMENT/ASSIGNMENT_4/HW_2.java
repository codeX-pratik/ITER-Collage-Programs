package ASSIGNMENT_4;
import java.util.*;
public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i=1 ; i<n ; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("The sum is " + sum);
        sc.close();
    }
}
