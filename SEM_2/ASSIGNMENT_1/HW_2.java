package ASSIGNMENT_1;
import java.util.*;
public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word : ");
        String str = sc.next();
        for (int i=str.length()-1 ; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}