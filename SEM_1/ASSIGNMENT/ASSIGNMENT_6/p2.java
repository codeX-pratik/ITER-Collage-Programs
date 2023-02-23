package ASSIGNMENT_6;
import java.util.*;
public class p2 {
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no. you want to display : ");
        int n = sc.nextInt();

        for (int i=1 ; i<=n ; i++) {
            int ans = getPentagonalNumber(i);
            System.out.print(ans + " , ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        sc.close();
    }
}
