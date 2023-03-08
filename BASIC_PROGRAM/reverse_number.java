package BASIC_PROGRAM;
import java.util.*;
public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n = n / 10; 
        }
        System.out.println("The Reverse of the Number is " + rev);

        sc.close();
    }
}

/*
Enter the Number : 1235
The Reverse of the Number is 5321
*/