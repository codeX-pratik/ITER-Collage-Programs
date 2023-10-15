import java.util.Scanner;
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int f = 1;
        for (int i=n ; i>=1 ; i--) {
            f *= i;
        }
        System.out.println("The factorial of " + n + " is " + f);
        sc.close();
    }
}

/*
Example : 
Enter a number : 3
The factorial of 3 is 6

Enter a number : 4
The factorial of 4 is 24

Enter a number : 5
The factorial of 5 is 120

Enter a number : 6
The factorial of 6 is 720

 */