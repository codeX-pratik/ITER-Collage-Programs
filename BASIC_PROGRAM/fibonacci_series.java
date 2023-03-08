package BASIC_PROGRAM;
import java.util.*;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth number of the series : ");
        int n = sc.nextInt();
        int a = 0 , b = 1 , sum = 0;
        for (int i=1 ; i<=n ; i++) {
            System.out.print(sum + " ");
            a = b;
            b = sum;
            sum = a + b;
        }

        sc.close();
    }
}
/*
Enter the nth number of the series : 10
0 1 1 2 3 5 8 13 21 34
*/