package ASSIGNMENT_5;
import java.util.*;
public class p7_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for (int i=1 ; i<=n ; i++) {
            //space
            for (int j=1 ; j<=n-i ; j++) {
                System.out.print("  ");
            }
            //pattern
            for (int j=1 ; j<=i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
output :

Enter a Number : 5
        1 
      2 2 
    3 3 3 
  4 4 4 4 
5 5 5 5 5

 */