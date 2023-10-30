import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is " + factorial(n));
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

/* factorial of a number

Example : 
Enter the Number : 3
The factorial of 3 is 6

Enter the Number : 4
The factorial of 4 is 24

Enter the Number : 5
The factorial of 5 is 120
 */