package ASSIGNMENT_4;
import java.util.*;
public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int t;
        t = n;

        int rev1 = 0;
        int rev2 = 0;

        while (n > 0) {
            int d = n % 10 ;
            rev1 = (rev1*10) + d;
            n = n / 10;
        }
        
        while (rev1 > 0) {
            int d = rev1 % 10;
            if (d != 0) {
                rev2 = (rev2*10) + d;
            }
            rev1 = rev1 / 10;
        }
        System.out.println("After removing 0 from number " + t + " , the new number is " + rev2);
        sc.close();
    }
}