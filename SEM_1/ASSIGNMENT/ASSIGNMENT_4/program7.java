package ASSIGNMENT_4;
import java.util.*;
public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no. for which you want to find multiplication table : ");
        int t = sc.nextInt();
        for (int i=1 ; i<=10 ; i++) {
            int m = t * i;
            System.out.println(t + " X " + i + " = " + m);
        }
        sc.close();
    }
}
