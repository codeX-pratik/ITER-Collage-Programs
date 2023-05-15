import java.util.*;
public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number at position " + n + " is " + fibo(n));

        sc.close();
    }

    public static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}

/*

Enter a Number : 7
Fibonacci number at position 7 is 13

 */