package DSA_ASSIGNMENT_2;
import java.util.*;

class Student {
    int roll_no;
    String name;
    double DSA_mark;
    void getdata(int r , String n , double m) {
        this.roll_no = r;
        this.name = n;
        this.DSA_mark = m;
    }
    void showdata() {
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.roll_no);
        System.out.println("DSA mark : " + this.DSA_mark);
    }
}

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student []stu = new Student[5];
        double highest_DSA_mark = Integer.MIN_VALUE;

        for (int i=0 ; i<5 ; i++) {
            System.out.println("------>  " + (i+1) + " Student.");
            System.out.print("Enter the Roll Number : ");
            int r = sc.nextInt();
            System.out.print("Enter the Name : ");
            String n = sc.nextLine();
            System.out.print("Enter the DSA mark : ");
            double m = sc.nextDouble();
            
            stu[i] = new Student();
            stu[i].getdata(r,n,m);
            
            if (stu[i].DSA_mark > highest_DSA_mark) {
                highest_DSA_mark = stu[i].DSA_mark;
            }
        }
        System.out.println("The Student , Secured Highest mark in DSA is ");
        for (int i=0 ; i<5 ; i++) {
            if (highest_DSA_mark == stu[i].DSA_mark) {
                stu[i].showdata();
                break;
            }
        }
        sc.close();
    }
}
