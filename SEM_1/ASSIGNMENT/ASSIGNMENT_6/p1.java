package ASSIGNMENT_6;
import java.util.*;
public class p1 {
    public static int additionSimple(int x , int y) {
        return x + y;
    }
    public static int subtrationSimple(int x , int y) {
        return x - y;
    }
    public static int multiplicationSimple(int x , int y) {
        return x * y;
    }
    public static double divisionSimple(int x , int y) {
        return x / y;
    }
    public static int remainderSimple(int x , int y) {
        return x % y;
    }
    public static double squarerootSimple (int x) {
        return Math.sqrt(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition (+)\n2. Subbtration (-)\n3. Multiplicattion (*)\n4. Division (/)\n5. Remainder (%)\n6. Squara root (sq)");
        System.out.print("Enter the operation (1-6) you want to perform : ");
        int o = sc.nextInt();
        int n1 , n2 ;

        switch(o) {
            case 1 : 
                System.out.print("Enter 1st Number : ");
                n1 = sc.nextInt();
                System.out.print("Enter 2st Number : ");
                n2 = sc.nextInt();
                System.out.println("The result is " + additionSimple(n1, n2));
            break;
            case  2 : 
                System.out.print("Enter 1st Number : ");
                n1 = sc.nextInt();
                System.out.print("Enter 2st Number : ");
                n2 = sc.nextInt();
                System.out.println("The result is " + subtrationSimple(n1, n2));
            break;
            case 3 : 
                System.out.print("Enter 1st Number : ");
                n1 = sc.nextInt();
                System.out.print("Enter 2st Number : ");
                n2 = sc.nextInt();
                System.out.println("The result is " + multiplicationSimple(n1, n2));
            break;
            case 4 : 
                System.out.print("Enter 1st Number : ");
                n1 = sc.nextInt();
                System.out.print("Enter 2st Number : ");
                n2 = sc.nextInt();
                System.out.println("The result is " + divisionSimple(n1, n2));
            break;
            case 5 : 
                System.out.print("Enter 1st Number : ");
                n1 = sc.nextInt();
                System.out.print("Enter 2st Number : ");
                n2 = sc.nextInt();
                System.out.println("The result is " + remainderSimple(n1, n2));
            break;
            case 6 :
                System.out.print("Enter a Number : ");
                n1 = sc.nextInt();
                System.out.println("The result is " + squarerootSimple(n1));
            break;
        }
        sc.close();
    }
}
