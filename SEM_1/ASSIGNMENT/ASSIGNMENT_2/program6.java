

import java.util.Scanner;
public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Seconds : ");
        double t = sc.nextDouble();
        double g = 32.174;
        double d = (1.0/2) * g * Math.pow(t , 2);

        System.out.println("Distance Travelled is " + d );
        sc.close();
    }
}
