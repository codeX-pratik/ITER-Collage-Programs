

import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Distance is km = ");
        int dis_km = sc.nextInt();

        int meter = dis_km * 1000;
        double feet = dis_km * 3280.8399;
        double inch = dis_km * 39370.0787;
        double centimeter = dis_km * 100000;

        System.out.println(dis_km + " km is " + meter + " meter");
        System.out.println(dis_km + " km is " + feet + " feet");
        System.out.println(dis_km + " km is " + inch + " inch");
        System.out.println(dis_km + " km is " + centimeter + " centimeter");
        sc.close();
    }
}