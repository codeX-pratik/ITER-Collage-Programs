#include <stdio.h>

#define taxRate 0.03625
#define overtime_Threshold 40
#define overtime_Rate 1.5

int main() {

    int N, empId;
    float hourlyWage, hoursWorked, grossPay, netPay, overTimeHours;
    float total_Pay = 0, total_netPay = 0, average_pay;

    printf("Enter the number of emploees : ");
    scanf("%d", &N);

    for(int i=1; i<=N; i++) {
        printf("Enter the employee ID for employee %d: ", i);
        scanf("%d", &empId);
        printf("Enter the hourly wage rate for employee %d: ", i);
        scanf("%f", &hourlyWage);
        printf("Enter the number of hours worked by employee %d: ", i);
        scanf("%f", &hoursWorked);

        if(hoursWorked > overtime_Threshold) {
            overTimeHours = hoursWorked - overtime_Threshold;
            grossPay = (overtime_Threshold * hourlyWage) + (overTimeHours * hourlyWage * overtime_Rate);
        } else {
            grossPay = hoursWorked * hourlyWage;
        }
        netPay = grossPay - (grossPay * taxRate);
        printf("Employee ID: %d, Net Pay: $%.2f\n\n", empId, netPay);

        total_Pay += grossPay;
        total_netPay += netPay;
    }

    average_pay = total_netPay / N;
    printf("Total Payroll (Gross): $%.2f\n", total_Pay);
    printf("Average Net Pay: $%.2f\n", average_pay);

    return 0;
}


/*

------> Output:
Enter the number of emploees : 3
Enter the employee ID for employee 1: 101
Enter the hourly wage rate for employee 1: 20
Enter the number of hours worked by employee 1: 45   
Employee ID: 101, Net Pay: $915.56

Enter the employee ID for employee 2: 102 
Enter the hourly wage rate for employee 2: 15
Enter the number of hours worked by employee 2: 38   
Employee ID: 102, Net Pay: $549.34

Enter the employee ID for employee 3: 103
Enter the hourly wage rate for employee 3: 22
Enter the number of hours worked by employee 3: 50   
Employee ID: 103, Net Pay: $1166.14

Total Payroll (Gross): $2730.00
Average Net Pay: $877.01

*/