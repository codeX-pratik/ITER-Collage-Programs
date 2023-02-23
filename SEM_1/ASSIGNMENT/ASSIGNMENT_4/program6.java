package ASSIGNMENT_4;
import java.util.*;
public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base : ");
        int b = sc.nextInt();
        System.out.print("Enter the power : ");
        int p = sc.nextInt();
        int i;
        i = p;
        int r = 1;
        
        while (p > 0) {
            r = r * b;
            p--;
        }
        System.out.println(b + " to the power " + i + " is " + r);
        sc.close();
    }
}
