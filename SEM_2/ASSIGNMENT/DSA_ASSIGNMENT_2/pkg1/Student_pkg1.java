package pkg1;
import java.util.*;
import pkg2.*;
public class Student_pkg1 {
    int rollNumber;
    String name;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Roll Number : ");
        rollNumber = sc.nextInt();
        System.out.print("Enter you Name : ");
        name = sc.next();
        sc.close();
    }
    public void output() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name : " + name);
    }
}
class Test extends Student_pkg1{
    double m1 , m2;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mark-1 : ");
        m1 = sc.nextDouble();
        System.out.print("Enter Mark-2 : ");
        m2 = sc.nextDouble();
        sc.close();
    }
    public void output() {
        System.out.println("Mark-1 : " + m1);
        System.out.println("Mark-1 : " + m1);
    }
}
class GrandTotal extends Test implements Sports {
    
    public void input() {
        super.input();
    }
    public void output() {
        super.output();
        System.out.println("Total Marks : " + (m1 + m2));
        System.out.println("Total Score : " + (score1 + score2));
        System.out.println("Grand Total Score : " + (m1 + m2 + score1 + score2));
    }
}