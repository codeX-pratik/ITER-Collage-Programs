package ASSIGNMENT_6;
import java.util.*;
class Sphere {
    void volume(double radius) {
        double volume = 4.0/3 * Math.PI * Math.pow(radius , 3);
        System.out.println("The volume of the Sphere is " + volume);
    }
}
class Cuboid{
    void volume(double length , double breadth , double height){
        double volume = length * breadth * height;
        System.out.println("The volume of the Cuboid is " + volume);
    }
}
class Cube{
    void volume (double side) {
        double volume = Math.pow(side,3);
        System.out.println("The volume of the cube is " + volume);
    }
}
public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape you want to find the volume : ");
        System.out.println("1. Sphere\n2. Cuboid \n3. Cube");
        System.out.print("Enter you choice (1-3) : ");
        int choice = sc.nextInt();

        Sphere obj1 = new Sphere();
        Cuboid obj2 = new Cuboid();
        Cube obj3 = new Cube();

        switch(choice) {
            case 1 : 
                System.out.print("Enter the radius of the sphere : ");
                double radius = sc.nextDouble();
                obj1.volume(radius);
            break;
            case 2 : 
                System.out.print("Enter the length of the cuboid : ");
                double length = sc.nextDouble();
                System.out.print("Enter the breath of the cuboid : ");
                double breadth = sc.nextDouble();
                System.out.print("Enter the heigth of the cuboid : ");
                double height = sc.nextDouble();
                obj2.volume(length, breadth, height);
            break;
            case 3 : 
                System.out.print("Enter the side of the cube : ");
                double side = sc.nextDouble();
                obj3.volume(side);
            break;
            default : System.out.println("Invalid choice");
            break;
        }
        sc.close();
    }
}
