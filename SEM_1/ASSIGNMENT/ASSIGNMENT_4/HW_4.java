package ASSIGNMENT_4;
import java.util.*;
public class HW_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 1;

        for (int i=1 ; i<=n ; i++) {
            if (i % 2 == 0) {
                even = even + i;
            } else {
                odd = odd * i;
            }
        }
        System.out.println("Sum of all even number is " + even);
        System.out.println("Odd of all even number is " + odd);
        sc.close();
    }
}
