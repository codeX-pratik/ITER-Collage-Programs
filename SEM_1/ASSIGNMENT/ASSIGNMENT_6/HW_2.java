package ASSIGNMENT_6;
import java.util.*;
public class HW_2 {
    public static double volumeSphere(double radius) {
        return 4.0/3 * Math.PI * Math.pow(radius, 3);
    }
    public static double volumeCuboid(double length , double breath , double height) {
        return length * breath * height;
    }
    public static double volumeCube(double side) {
        return Math.pow(side, 3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape you want to find the volume : ");
        System.out.println("1. Sphere\n2. Cuboid \n3. Cube");
        System.out.print("Enter you choice (1-3) : ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1 : 
                System.out.print("Enter the radius of the sphere : ");
                double radius = sc.nextDouble();
                System.out.println("The volume of the sphere is " + volumeSphere(radius));
            break;
            case 2 : 
                System.out.print("Enter the length of the cuboid : ");
                double lenght = sc.nextDouble();
                System.out.print("Enter the breath of the cuboid : ");
                double breadth = sc.nextDouble();
                System.out.print("Enter the heigth of the cuboid : ");
                double height = sc.nextDouble();
                System.out.println("The volume of the cubiod is " + volumeCuboid(lenght, breadth, height));
            break;
            case 3 : 
                System.out.print("Enter the side of the cube : ");
                double side = sc.nextDouble();
                System.out.println("The volume of the cube is " + volumeCube(side));
            break;
            default : System.out.println("Invalid choice");
            break;
        }
        sc.close();
    }
}
