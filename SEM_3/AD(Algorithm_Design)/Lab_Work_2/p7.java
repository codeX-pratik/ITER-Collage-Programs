import java.util.Scanner;

public class p7 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.print("Enter the power : ");
        int p = sc.nextInt();
        System.out.println("The value of " + n + " to the power " + p + " is " + power(n, p));
    }

    public static int power(int n , int p) {
        if (p == 0) {
            return 1;
        }
        return n * power(n, p-1);
    }
}

/*

Example : 
Enter the Number : 2
Enter the power : 4
The value of 2 to the power 4 is 16

 */