package ASSIGNMENT_4;
import java.util.*;
public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1 ; i<=n ; i++) {
            int r = (int)(n*Math.random()) + 1;
            System.out.print(r + " ");
            sum = sum + r;
        }
        System.out.println();
        int avg = sum / n;
        System.out.println("Average of " + n + " random number are " + avg);
        sc.close();
    }
}
