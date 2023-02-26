package ASSIGNMENT_5;
import java.util.*;
public class p6_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        for (int i=1 ; i<=n ; i++) {
            for (int j=1 ; j<=i ; j++) {
                System.out.print(j + " ");
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
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5

 */