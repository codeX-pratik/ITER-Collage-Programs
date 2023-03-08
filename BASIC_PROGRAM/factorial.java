package BASIC_PROGRAM;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int f = 1;
        for (int i=1 ; i<=n ; i++) {
            f = f * i;
        }
        System.out.println("The factorial of is " + f);

        sc.close();
    }
}
/*
Enter the Number : 3
The factorial of is 6

Enter the Number : 4
The factorial of 4 is 24

Enter the Number : 5
The factorial of 5 is 120
*/