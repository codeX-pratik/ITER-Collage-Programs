

import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Hemisphere : ");
        double r = sc.nextDouble();

        double area = Math.PI * 3 * Math.pow(r , 2);
        double volume = (2.0/3) * Math.PI * Math.pow(r, 3);

        System.out.println("The surface area of the hemisphere is " + area);
        System.out.println("The volume of the Hemisphere is " + volume);
        sc.close();

    }
}
