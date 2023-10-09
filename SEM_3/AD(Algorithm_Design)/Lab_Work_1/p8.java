import java.util.Scanner;
public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth number of fibonacci series : ");
        int n = sc.nextInt();
        System.out.println("The nth number of fibonacci series is " + fibonacci(n));
        sc.close();
    }

    public static int fibonacci(int n) {
        int a = 0 , b = 1 , c;
        if (n == 0) {
            return 0;
        }
        for (int i=2 ; i<=n ; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}

/*

Enter the nth number of fibonacci series : 6
The nth number of fibonacci series is 8

Enter the nth number of fibonacci series : 7
The nth number of fibonacci series is 13

Enter the nth number of fibonacci series : 8
The nth number of fibonacci series is 21

Enter the nth number of fibonacci series : 9
The nth number of fibonacci series is 34
 */