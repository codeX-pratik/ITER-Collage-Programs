import java.util.*;
public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----> MENU <----");
        System.out.println("1. Determine the factorial of a number");
        System.out.println("2. Determine X to power N for two numbers X, N");
        System.out.println("3. Determine GCD of two number");
        System.out.println("4. Binary equivalent of a decimal number");
        System.out.println("5. Product of two numbers");

        System.out.print("Enter Your Choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the Number : ");
                int f = sc.nextInt();
                System.out.print("The factorial of " + f + " the Number is ");
                System.out.print(factorial(f));
                break;
            case 2:
                System.out.print("Enter the base and the power : ");
                int base = sc.nextInt();
                int power = sc.nextInt();
                System.out.print("The power of " + base + " to the power " + power + " is ");
                System.out.print(power(base, power));
                break;
            case 3:
                System.out.print("Enter the two number : ");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                System.out.print("The GCD of " + n1 + " and " + n2 + " is ");
                System.out.print(gcd(n1, n2));
                break;
            case 4:
                System.out.print("Enter a Number : ");
                int b1 = sc.nextInt();
                System.out.print("The Binary value of the Number " + b1 + " is ");
                System.out.print(decimalToBinary(b1));
                break;
            case 5:
                System.out.print("Enter two Number : ");
                int a1 = sc.nextInt();
                int a2 = sc.nextInt();
                System.out.print("The product of " + a1 + " and " + a2 + " is ");
                System.out.print(product(a1, a2));
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    
    public static int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 2 + 10 * decimalToBinary(n / 2);
        }
    }
    
    public static int product(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + product(a, b - 1);
        }
    }
}
