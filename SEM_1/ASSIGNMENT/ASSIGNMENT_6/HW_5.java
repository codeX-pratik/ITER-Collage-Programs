package ASSIGNMENT_6;
import java.util.*;
public class HW_5 {
    public static boolean checkConsecutive(int x , int y , int z) {
        if ((y == (x+1) && z == (x+2)) || y == (x-1) && z == (x-2)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter the 3rd Number : ");
        int n3 = sc.nextInt();

        System.out.println("check whether the three said number are consecutive or not !");
        System.out.println(checkConsecutive(n1, n2, n3));
        sc.close();
    }
}
