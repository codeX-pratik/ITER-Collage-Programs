package ASSIGNMENT_6;
import java.util.*;
public class HW_2 {
    void volume(double radius) {
        double volume = 4.0/3 * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of sphere is " + volume);
    }
    void volume(double length , double breath , double height) {
        double volume = length * breath * height;
        System.out.println("The volume of cubiod is " + volume);
    }
    void volume(int side) {
        double volume = Math.pow(side, 3);
        System.out.println("The volume of cube is " + volume);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape you want to find the volume : ");
        System.out.println("1. Sphere\n2. Cuboid \n3. Cube");
        System.out.print("Enter you choice (1-3) : ");
        int choice = sc.nextInt();

        HW_2 obj = new HW_2();

        switch(choice) {
            case 1 : 
                System.out.print("Enter the radius of the sphere : ");
                double radius = sc.nextDouble();
                obj.volume(radius);
            break;
            case 2 : 
                System.out.print("Enter the length of the cuboid : ");
                double lenght = sc.nextDouble();
                System.out.print("Enter the breath of the cuboid : ");
                double breadth = sc.nextDouble();
                System.out.print("Enter the heigth of the cuboid : ");
                double height = sc.nextDouble();
                obj.volume(lenght, breadth, height);
            break;
            case 3 : 
                System.out.print("Enter the side of the cube : ");
                int side = sc.nextInt();
                obj.volume(side);
            break;
            default : System.out.println("Invalid choice");
            break;
        }
        sc.close();
    }
}
