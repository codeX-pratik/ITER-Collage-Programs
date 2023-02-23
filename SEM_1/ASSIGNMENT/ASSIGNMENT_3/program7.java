package ASSIGNMENT_3;

import java.util.Scanner;
public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total units produced in this Month :");
        int unit = sc.nextInt();
        double bill_pay = 0;

        if (unit < 50) {
            bill_pay = unit * 3;
        } else if (unit < 200) {
            bill_pay = 50 * 3 + (unit - 50) * 4.80;
        } else if (unit < 400) {
            bill_pay = 50 * 3 + 150 * 4.80 + (unit - 200) * 5.80;
        } else if (unit > 400) {
            bill_pay = 50 * 3 + 150 * 4.80 + 200 * 5.80 + (unit - 400) * 6.20;
        }

        System.out.print("Do you want to pay online (y/n) :");
        String ans = sc.next();
        
        double discount = bill_pay * 3/100;
        double amount_payable = bill_pay - discount;

        if (ans.equals("y")) {
            System.out.println("Total amount is " + bill_pay);
            System.out.println("Discount is " + discount);
            System.out.println("Amount payable is " + amount_payable);
        } else {
            System.out.println("Amount payable is " + bill_pay);
        }

        sc.close();
    }
}