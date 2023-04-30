import java.util.*;
abstract class Shape {
    abstract void area();
    double area;
    String shape;
    void display() {
        System.out.println("The Area of the " + shape + " is " + area);
    }
}
class Square extends Shape {
    double side;
    Square(double s) {
        this.side = s;
    }
    void area() {
        shape = "square";
        area = side * side;
    }
}
class Circle  extends Shape {
    double radius;
    Circle(double r) {
        this.radius = r;
    }
    void area() {
        shape = "Circle";
        area = Math.PI * Math.pow(radius, 2);
    }
}
class Triangle extends Shape {
    double base , height;
    Triangle(double b , double h) {
        this.base = b;
        this.height = h;
    }
    void area() {
        shape = "Triangle";
        area = 0.5 * base * height;
    }
}

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----> Shape <----");
        System.out.println("1. Square \n2. Circle \n3. Triangle");
        System.out.print("Enter your Choice : ");
        int Choice = sc.nextInt();

        switch(Choice) {
            case 1 : 
                System.out.print("Enter the side of the Square : ");
                double s = sc.nextDouble();
                Square obj_s = new Square(s);
                obj_s.area();
                obj_s.display();
            break;
            case 2 :
                System.out.print("Enter the radius of the Cirlce : ");
                double r = sc.nextDouble();
                Circle obj_c = new Circle(r);
                obj_c.area();
                obj_c.display();
            break;
            case 3 : 
                System.out.print("Enter the base of the Triangle : ");
                double b = sc.nextDouble();
                System.out.print("Enter the height of the Triangle : ");
                double h = sc.nextDouble();
                Triangle obj_t = new Triangle(b, h);
                obj_t.area();
                obj_t.display();
            break;
            default :
                System.out.println("Invalid Choice !!");
            break;
        }
        sc.close();
    }
}