package ASSIGNMENT_5;
import java.util.*;
public class p7_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int a = 65;
        for (int i=a ; i<a+n ; i++) {
            for (int j=a ; j<=i ; j++) {
                System.out.print((char)j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
output :

Enter a Number : 5
A 
A B 
A B C 
A B C D 
A B C D E

 */