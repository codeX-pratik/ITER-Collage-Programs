import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        System.out.println("The sum is " + sum(sc.nextInt()));
        sc.close();
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return n + sum(n - 1) ;
    }
}

/* --> Sum of n numbers

Example : 
Enter the Number : 3
The sum is 6

Enter the Number : 5
The sum is 15

 */