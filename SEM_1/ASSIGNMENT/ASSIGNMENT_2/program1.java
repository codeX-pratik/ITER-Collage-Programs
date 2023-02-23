

import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a degree in fahrenheit : ");
        double f = sc.nextDouble();

        double c = (f - 32) * (5.0/9);
        System.out.println(f + " Fahrenheit is " + c + " Celsius");
        sc.close();
    }
}
