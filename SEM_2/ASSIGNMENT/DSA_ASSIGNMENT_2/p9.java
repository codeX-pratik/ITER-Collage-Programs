package DSA_ASSIGNMENT_2;
import java.util.Scanner;
class Student {
    int roll_no;
    String name;
    String course;

    void input_Student() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the Roll Number : ");
        roll_no = sc1.nextInt();
        System.out.println("Enter the Name : ");
        name = sc1.next();
        System.out.println("Enter the Course : ");
        course = sc1.next();
        sc1.close();
    }
    void display_Student() {
        System.out.println("Rool Number : " + roll_no);
        System.out.println("Name : " + name);
        System.out.println("Course" + course);
    }
}
class Exam extends Student {
    double m1 , m2 , m3;
    
    void input_Mark() {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your of 3 Subject : ");
        m1 = sc2.nextDouble();
        m2 = sc2.nextDouble();
        m3 = sc2.nextDouble();
        sc2.close();
    }
    void display_result() {
        System.out.println("Subject 1 " + m1);
        System.out.println("Subject 2 " + m2);
        System.out.println("Subject 3 " + m3);
    }
}
public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Student : ");
        int n = sc.nextInt();
        
        Exam arr[] = new Exam[n];
        for (int i=0 ; i<n ; i++) {
            System.out.println("Enter the Detail of the Student " + (i+1) + " : ");
            arr[i] = new Exam();
            arr[i].input_Student();
            arr[i].input_Mark();
        }

        for (int i=0 ; i<n ; i++) {
            System.out.println("Detail and Marks of the Student " + (i+1) + " : ");
            arr[i].display_Student();
            arr[i].display_result();
        }
        sc.close();
        
    }
}
