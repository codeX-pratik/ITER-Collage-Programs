import java.util.*;
class Student_p9 {
    int roll_NUmber;
    String name;
    String course;
    Scanner sc = new Scanner(System.in);
    void input_Student() {
        System.out.print("Enter you Roll Number : ");
        roll_NUmber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your Name : ");
        name = sc.nextLine();
        System.out.print("Enter your Course : ");
        course = sc.next();
        
    }
    void display_Student() {
        System.out.println("Roll Number : " + roll_NUmber);
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
    }
}
class Exam_p9 extends Student_p9 {
    double m1 , m2 , m3;
    Scanner sc = new Scanner(System.in);
    void intput_Marks() {
        System.out.print("Enter mark-1 : ");
        m1 = sc.nextDouble();
        System.out.print("Enter mark-2 : ");
        m2 = sc.nextDouble();
        System.out.print("Enter mark-3 : ");
        m3 = sc.nextDouble();
        
    }
    void display_Result() {
        System.out.println("Mark-1 : " + m1);
        System.out.println("Mark-2 : " + m2);
        System.out.println("Mark-3 : " + m3);
        double totalMark = m1 + m2 + m3;
        double percentage = totalMark/3;
        System.out.println("Total Marks : " + totalMark);
        System.out.println("Percentage : " + percentage);
    }
}
public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of Student : ");
        int n = sc.nextInt();
        Exam_p9 exam[] = new Exam_p9[n];
        for (int i=0 ; i<exam.length ; i++) {
            exam[i] = new Exam_p9();
            System.out.println("---> STUDENT " + (i+1));
            exam[i].input_Student();
            exam[i].intput_Marks();
        }
        for (int i=0 ; i<exam.length ; i++) {
            System.out.println("---> " + (i+1) + " STUDENT RESULT <---");
            exam[i].display_Student();
            exam[i].display_Result();
        }
        sc.close();
    }
}