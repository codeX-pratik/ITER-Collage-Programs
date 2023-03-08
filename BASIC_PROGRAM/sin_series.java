package BASIC_PROGRAM;
import java.util.*;
public class sin_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number of Term : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of theta : ");
        int theta = sc.nextInt();

        double radian = theta*Math.PI / 180;
        int p = 1;
        double sinx = 0;

        for (int i=1 ; i<=n ; i++) {
            int f = 1;
            for (int j=1 ; j<=p ; j++) {
                f = f * j;
            }
            double ct = 0;
            if (i % 2 == 0) {
                ct = -Math.pow(radian, p) / f;
            } else {
                ct = Math.pow(radian, p) / f;
            }
            sinx = sinx + ct;
            p = p + 2;
        }
        System.out.println("The sin x value is " + sinx);

        sc.close();
    }
}
/*
Enter the Number of Term : 4
Enter the value of theta : 45
The sin x value is 0.7071064695751781
*/