package ASSIGNMENT_6;
import java.util.*;
public class p5 {
    public static double area(int n , double s) {
        double area = (n * s * s) / (4 * Math.tan(Math.PI/n));
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the side : ");
        double s = sc.nextDouble();

        System.out.println(area(n, s));
        sc.close();
    }
}
