package ASSIGNMENT_4;
import java.util.*;
public class HW_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        String st1 = " ";
        for (int i=1 ; i<=n ; i++) {
            st1 = st1 + i + st1;
            System.out.println(st1);
        }
        sc.close();
    }
}
