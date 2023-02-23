

import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic salary :");
        int BS = sc.nextInt();

        int DA = BS * 40/100;
        int HRA = BS * 20/100;
        int GS = BS + DA + HRA;

        System.out.println("DA is " + DA);
        System.out.println("HRA is " + HRA);
        System.out.println("Gross salary is " + GS);
        sc.close();
    }
}
