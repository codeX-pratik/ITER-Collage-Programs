package pkg1;
import java.util.*;

public class Student_pkg1 {
    private int rollNumber;
    private String name;
    public void input_s() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Roll Number : ");
        rollNumber = sc.nextInt();
        System.out.print("Enter you Name : ");
        name = sc.next();
        
    }
    public void output_s() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name : " + name);
    }
}
