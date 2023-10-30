import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth number : ");
        System.out.println("The fibonacci number is " + fibonacci(sc.nextInt()));
        sc.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

/* Generating nth fibonacci number

Example : 
Enter the nth number : 6
The fibonacci number is 8

Enter the nth number : 7
The fibonacci number is 13

 */