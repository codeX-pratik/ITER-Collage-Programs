package BASIC_PROGRAM;
import java.util.*;
public class cos_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of theta : ");
        int theta = sc.nextInt();
        double radian = theta*Math.PI / 180;
        int p = 0;
        double cosx = 0;      
        for (int i=1 ; i<=n ; i++) {
            // factorial
            int f = 1;
            for (int j=1 ; j<=p ; j++) {
                f = f * j;
            }
            double ct = 0;
            if (i % 2 != 0) {
                ct = Math.pow(radian, p) / f;
            } else {
                ct = -Math.pow(radian, p) / f;
            }
            cosx = cosx + ct;
            p = p + 2;
        }
        System.out.println("The cos x value is " + cosx);

        sc.close();
    }
}
/*
Enter the number of terms : 4
Enter the value of theta : 90
The cos x value is -8.945229984747317E-4
*/