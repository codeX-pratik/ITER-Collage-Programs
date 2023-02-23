package ASSIGNMENT_4;
import java.util.*;
public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second Number : ");
        int n2 = sc.nextInt();
        int gcd = 0;
        for (int i=1 ; i<=Math.min(n1,n2); i++) {
            if (n1%i==0 && n2%i==0) {
                gcd = i;
            }
        }
        System.out.println("The GCD is " + gcd);
        sc.close();
    }
}
