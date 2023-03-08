package BASIC_PROGRAM;
import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int c = 0;
        for (int i=2 ; i<n ; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 0) {
            System.out.println("This is a Prime Number.");
        } else {
            System.out.println("This is not a Prime Number.");
        }
        sc.close();
    }
}
/*
Enter a Number : 97
This is a Prime Number.

Enter a Number : 32
This is not a Prime Number.
*/