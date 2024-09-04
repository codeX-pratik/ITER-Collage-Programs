#include <stdio.h>

int main() {
    double height, flowRate;
    double gravitation_Constant = 9.80;
    double efficiency_Constant = 0.90;
    double massPerCubic_Meter = 1000.0;

    printf("Enter the height of the dam in meter : ");
    scanf("%lf", &height);
    printf("Enter the flow rate of water in cubic meter per second : ");
    scanf("%lf", &flowRate);

    double mass = flowRate * 1000;
    double workDone = mass * gravitation_Constant * height;
    double powerOutput = efficiency_Constant * workDone;
    double megaWatts = powerOutput / 1e6;

    printf("Predicted power output: %.2f megawatts\n", megaWatts);
    return 0;
}

/*

------> output :
Enter the height of the dam in meter : 170
Enter the flow rate of water in cubic meter per second : 1300
Predicted power output: 1949.22 megawatts

*/