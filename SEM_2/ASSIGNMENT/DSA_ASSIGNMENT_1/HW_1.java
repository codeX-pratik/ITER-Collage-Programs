import java.util.*;
public class HW_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b == c) {
            System.out.println(a + " + " + b + " = " + c);
        } else if (a == b - c) {
            System.out.println(a + " = " + b + " - " + c);
        } else if (a * b == c) {
            System.out.println(a + " * " + b + " = " + c);
        } else {
            System.out.println("The Number can not be used in arithmetic formula.");
        }
        sc.close();
    }
}