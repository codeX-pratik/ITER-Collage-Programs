package ASSIGNMENT_5;
import java.util.*;
public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i=1 ; i<=n ; i++) {
            //space
            for (int j=1 ; j<=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j=1 ; j<(i*2) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
output :

Enter a number : 4
      * 
    * * * 
  * * * * * 
* * * * * * *

 */