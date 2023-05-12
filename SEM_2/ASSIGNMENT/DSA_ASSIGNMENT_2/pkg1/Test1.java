package pkg1;
import java.util.*;
public class Test1 extends Student_pkg1{
    private double m1 ;
    private double m2;
    public void input_m() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mark-1 : ");
        m1 = sc.nextDouble();
        System.out.print("Enter Mark-2 : ");
        m2 = sc.nextDouble();
        sc.close();
    }
    public void output_m() {
        System.out.println("Mark-1 : " + m1);
        System.out.println("Mark-2 : " + m2);
    }
    public double getMark1() {
        return m1;
    }
    public double getMark2() {
        return m2;
    }
}