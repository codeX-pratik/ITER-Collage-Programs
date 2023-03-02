package ASSIGNMENT_6;
import java.util.*;
public class p10 {
    void area(double base , double height) {
        double area = 0.5 * base * height;
        System.out.println("The area of Triangle is " + area);
    }
    void area(int side) {
        double area = side * side;
        System.out.println("The area of Square is " + area);
    }
    void area(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("The area of Circle is " + area);
    }
    void area(int length , int breadth) {
        double area = length * breadth;
        System.out.println("The area of rectrangle is " + area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Triangle\n2. Square\n3. Circle\n4. Rectrangle");
        System.out.print("Enter your choice(1-4) : ");
        int choice = sc.nextInt();

        p10 obj = new p10();

        switch(choice) {
            case 1 : 
                System.out.print("Enter the base : ");
                double base = sc.nextDouble();
                System.out.print("Enter the height : ");
                double height = sc.nextDouble();
                obj.area(base, height);
            break;
            case 2 : 
                System.out.print("Enter the side : ");
                int side = sc.nextInt();
                obj.area(side);
            break;
            case 3 : 
                System.out.print("Enter the radius : ");
                double radius = sc.nextDouble();
                obj.area(radius);
            break;
            case 4 : 
                System.out.print("Enter the length : ");
                int length = sc.nextInt();
                System.out.print("Enter the breadth : ");
                int breadth = sc.nextInt();
                obj.area(length, breadth);
            break;
            default : System.out.println("Invalid Number !");
        }
        sc.close();
    }
}
