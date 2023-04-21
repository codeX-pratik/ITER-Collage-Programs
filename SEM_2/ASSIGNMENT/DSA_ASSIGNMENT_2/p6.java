package DSA_ASSIGNMENT_2;
import java.util.*;
abstract class Shape {
    abstract double calculate_area();
}
class Square extends Shape {
    double side;
    Square (double s) {
        side = s;
    }
    @Override
    double calculate_area() {
        return (side * side);
    }
}
class Circle extends Shape {
    double radius;
    Circle (double r) {
        radius = r;
    }
    @Override
    double calculate_area() {
        return (Math.PI * Math.pow(radius,2));
    }
}
class Triangle extends Shape {
    double base , height;
    Triangle (double b , double h) {
        base = b;
        height = h;
    }
    @Override
    double calculate_area() {
        return (0.5 * base * height);
    }
}
public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----> Choose a Shape <----");
        System.out.println("1. Square \n2. Triangle \n3. Circle");
        System.out.print("Enter your Choice : ");
        int Choice = sc.nextInt();

        
        switch(Choice) {
            case 1 :
                System.out.print("Enter the side of the Square : ");
                double s1 = sc.nextDouble();
                Square s = new Square(s1);
                System.out.print("The area of the Square is ");
                s.calculate_area();
            break;
            case 2 :
                System.out.print("Enter the radius of the Circle : ");
                double r1 = sc.nextDouble();
                Circle c = new Circle(r1);
                System.out.print("The area of the Circle is ");
                c.calculate_area();
            break;
            case 3 :
                System.out.print("Enter the base of the Triangle : ");
                double b = sc.nextDouble();
                System.out.println("Enter the height of the Triangle : ");
                double h = sc.nextDouble();
                Triangle t = new Triangle(b, h);
                System.out.print("The area of the Trianle is ");
                t.calculate_area();
            break;
            default : 
                System.out.println("Invalid Choice !!");
            break;
        }
        
        sc.close();
    }
}
