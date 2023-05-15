import java.util.*;
public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.print("The reverse of the given number is : ");
        reverseInteger(n);

        sc.close();
    }

    public static void reverseInteger(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            System.out.print(n % 10);
            reverseInteger(n / 10);
        }
    }
}

/*

Enter a Number : 1234
The reverse of the given number is : 4321

 */