/*
WAP to display the multiplication table from 2 to 15
*/
package ASSIGNMENT_5;
import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2st Number : ");
        int n2 = sc.nextInt();

        for (int i=n1 ; i<=n2 ; i++) {
            System.out.println("Multiplication of " + i);
            for (int j=1 ; j<=10 ; j++) {
                int m = i * j;
                System.out.println(i + " X " + j + " = " + m);
            }
        }
        sc.close();
    }
}

/*
Multiplication table of 2 
2 × 1 = 2 
2 × 2 = 4 
: 
: 
2 × 10 = 20 
Multiplication table of 3 
3 × 1 = 3 
3 × 2 = 6 
: 
: 
3 × 10 = 30 
: 
: 
: 
Multiplication table of 15 
15 × 1 = 15 
15 × 2 = 30 
: 
: 
15 × 10 = 150

 */




