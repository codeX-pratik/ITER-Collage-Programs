import java.util.Scanner;

public class p5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The GCD of " + a + " and " + b + " is " + GCD(a, b));
    }

    public static int GCD(int a , int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}

/*

Example : 
Enter two numbers : 24 18
The GCD of 24 and 18 is 6

 */