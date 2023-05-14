import java.util.Scanner;

class MarksOutOfBoundException extends Exception {
    public String getMessage() {
        return "Marks can't be greater than 100";
    }
}

class Student {
    String name;
    double mark;
    
    Student (String name , double mark) throws MarksOutOfBoundException{
        if (mark > 100) {
            throw new MarksOutOfBoundException();
        }
        this.name = name;
        this.mark = mark;
    }
    public String getScored() {
        return (name + " has Scored " + mark);
    }
}
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the name of the Student : ");
            String name = sc.next();
            System.out.print("Enter Mark : ");
            double mark = sc.nextDouble();
            Student s  = new Student(name, mark);
            System.out.println(s.getScored());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*

Enter the name of the Student : REMESH
Enter Mark : 98
REMESH has Scored 98.0

Enter the name of the Student : RAJU
Enter Mark : 130
MarksOutOfBoundException: Marks can't be greater than 100

 */