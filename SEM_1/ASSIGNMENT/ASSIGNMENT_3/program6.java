package ASSIGNMENT_3;

import java.util.Scanner;
public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total units produced in this Month :");
        int unit = sc.nextInt();
        double bill_pay;

        if (unit < 50) {
            bill_pay = unit * 3;
            System.out.println("Your Eletricity Bill is " + bill_pay);
        } else if (unit < 200) {
            bill_pay = 50 * 3 + (unit - 50)*4.80;
            System.out.println("Your Eletricity Bill is " + bill_pay);
        } else if (unit < 400) {
            bill_pay = 50 * 3 + 150 * 4.80 + (unit - 200) * 5.80; 
            System.out.println("Your Eletricity Bill is " + bill_pay);
        } else if (unit > 400) {
            bill_pay = 50 * 3 + 150 * 4.80 + 200 * 5.80 + (unit - 400) * 6.20;
            System.out.println("Your Eletricity Bill is " + bill_pay);
        }

        sc.close();
    }
}