import java.util.*;
class Commission {
    double sales;
    Commission(double s) {
        this.sales = s;
    }
    String getCommission() {
        String commission = "";
        if (sales <= 0) {
            commission = "Invalid Input";
        } else if (sales > 0 && sales < 100) {
            commission = "2 %";
        } else if (sales >= 100 && sales < 500) {
            commission = "3 %";
        } else if (sales >= 500 && sales < 5000) {
            commission = "5 %";
        } else if (sales >= 5000) {
            commission = "8 %";
        }
        return commission;
    }
}

public class HW_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales amount : ");
        double sale = sc.nextDouble();
        Commission c = new Commission(sale);
        System.out.println("Your Commission is " + (c.getCommission()));
        sc.close();
    }
}
 