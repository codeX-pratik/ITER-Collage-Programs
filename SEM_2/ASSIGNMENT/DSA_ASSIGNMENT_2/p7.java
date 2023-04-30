import java.util.*;
class Person {
    String name;
    int age;
    Person(String name , int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {

    private int Eid;
    private double salary;
    Employee(String name, int age , int Eid , double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }
    void empdisplay() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Employee ID : " + Eid);
        System.out.println("Salary : " + salary);
    }
    
}
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp1 = new Employee("Java_User", 19, 1234, 50000);
        emp1.empdisplay();

        sc.close();
    }
}