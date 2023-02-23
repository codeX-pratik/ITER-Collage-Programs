package ASSIGNMENT_4;
import java.util.*;
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter the 3rd Number : ");
        int n3 = sc.nextInt();
        int sum = 0;
        for (int i=n1 ; i<=n2 ; i=i+n3) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("The sum of the number is "+sum);
        sc.close();
    }
}
