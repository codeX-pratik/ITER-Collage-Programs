package BASIC_PROGRAM;
import java.util.*;
public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int binary = 0;
        while (n > 0) {
            binary = (binary * 10) + (n % 2);
            n = n / 2;
        }
        System.out.println("The Binary value is " + binary);

        sc.close();
    }
}
/*
Enter a Number : 45
The Binary value is 101101

Enter a Number : 15
The Binary value is 1111
*/