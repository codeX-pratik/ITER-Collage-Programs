#include <stdio.h>

int main() {
    const double BASE_RATE = 39.99;
    const int INCLUDED_WEEKDAY_MINUTES = 600;
    const double ADDITIONAL_MINUTE_COST = 0.40;
    const double TAX_RATE = 0.0525;

    int weekday_minutes, night_minutes, weekend_minutes, total_minutes_used;
    double additional_charges, pretax_bill, taxes, total_bill, average_cost_per_minute;

    // Prompt user for input
    printf("Enter the number of weekday minutes used: ");
    scanf("%d", &weekday_minutes);
    printf("Enter the number of night minutes used: ");
    scanf("%d", &night_minutes);
    printf("Enter the number of weekend minutes used: ");
    scanf("%d", &weekend_minutes);

    additional_charges = 0.0;
    if (weekday_minutes > INCLUDED_WEEKDAY_MINUTES) {
        additional_charges = (weekday_minutes - INCLUDED_WEEKDAY_MINUTES) * ADDITIONAL_MINUTE_COST;
    }

    pretax_bill = BASE_RATE + additional_charges;
    taxes = pretax_bill * TAX_RATE;
    total_bill = pretax_bill + taxes;

    total_minutes_used = weekday_minutes + night_minutes + weekend_minutes;
    average_cost_per_minute = 0.0;
    if (total_minutes_used > 0) {
        average_cost_per_minute = pretax_bill / total_minutes_used;
    }

    printf("\n<----> Chatflow Wireless Monthly Bill Summary <---->\n");
    printf("Weekday minutes used: %d\n", weekday_minutes);
    printf("Night minutes used: %d\n", night_minutes);
    printf("Weekend minutes used: %d\n", weekend_minutes);
    printf("Base rate (for up to 600 weekday minutes): $%.2f\n", BASE_RATE);
    printf("Additional charges for extra weekday minutes: $%.2f\n", additional_charges);
    printf("Pretax bill: $%.2f\n", pretax_bill);
    printf("Average cost per minute (before taxes): $%.4f\n", average_cost_per_minute);
    printf("Taxes: $%.2f\n", taxes);
    printf("Total bill: $%.2f\n", total_bill);

    return 0;
}

/*

Enter the number of weekday minutes used: 650
Enter the number of night minutes used: 300
Enter the number of weekend minutes used: 200

<----> Chatflow Wireless Monthly Bill Summary <---->
Weekday minutes used: 650
Night minutes used: 300
Weekend minutes used: 200
Base rate (for up to 600 weekday minutes): $39.99   
Additional charges for extra weekday minutes: $20.00
Pretax bill: $59.99
Average cost per minute (before taxes): $0.0522
Taxes: $3.15
Total bill: $63.14

*/