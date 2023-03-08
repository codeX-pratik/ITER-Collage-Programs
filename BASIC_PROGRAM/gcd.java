package BASIC_PROGRAM;
import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int n2 = sc.nextInt();
        int gcd = 0;
        for (int i=1 ; i<=Math.min(n1,n2); i++) {
            if (n1%i==0 && n2%i==0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);


        sc.close();
    }
}
/*
Enter 1st Number : 47 
Enter 2nd Number : 26
GCD of 47 and 26 is 1

Enter 1st Number : 5
Enter 2nd Number : 10
GCD of 5 and 10 is 5

Enter 1st Number : 56
Enter 2nd Number : 98
GCD of 56 and 98 is 14
*/