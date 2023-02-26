package ASSIGNMENT_5;
import java.util.*;
public class p7_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for (int i=(n-1) ; i>=0 ; i--) {
            for (int j=0 ; j<=i ; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
output :

Enter a Number : 5
$ $ $ $ $ 
$ $ $ $ 
$ $ $ 
$ $ 
$

 */