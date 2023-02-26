package ASSIGNMENT_5;
import java.util.*;
public class p6_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int s = 1;
        for (int i=1 ; i<=n ; i++) {
            for (int j=1 ; j<=i ; j++) {
                System.out.print(s + " ");
                s++;
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
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

 */