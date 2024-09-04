#include <stdio.h>
#include <math.h>

int main() {
    double purchased_Price, down_Payment, annual_Interest_Rate;
    int total_Payments;

    printf("Enter the purchased price : $");
    scanf("%lf", &purchased_Price);

    printf("Enter the down payment : $");
    scanf("%lf", &down_Payment);

    printf("Enter the annual interest rate : ");
    scanf("%lf", &annual_Interest_Rate);

    printf("Enter the total no. of payments (usually 36, 48, or 60) : ");
    scanf("%d", &total_Payments);

    double principal = purchased_Price - down_Payment;
    double monthly_Interest_Rate = annual_Interest_Rate / 100 / 12;
    double monthly_Payment;
    if (monthly_Interest_Rate != 0) {
        monthly_Payment = (monthly_Interest_Rate * principal) /(1 - pow(1 + monthly_Interest_Rate, -total_Payments));
    } else {
        monthly_Payment = principal / total_Payments;
    }

    printf("Amount borrowed : $%.2lf\n", principal);
    printf("Monthly Payment : $%.2lf\n", monthly_Payment);
    return 0;
}

/*

------> output :
Enter the purchased price : $20000
Enter the down payment : $500
Enter the annual interest rate : 5
Enter the total no. of payments (usually 36, 48, or 60) : 48
Amount borrowed : $19500.00
Monthly Payment : $449.07

*/