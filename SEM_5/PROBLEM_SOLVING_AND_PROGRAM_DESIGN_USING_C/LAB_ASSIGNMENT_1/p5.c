#include <stdio.h>

double calculation_Acceleration(double final, double initial, double time) {
    return (final - initial) / time;
}

double time_rest(double initial, double acceleration) {
    return -initial / acceleration;
}

int main() {
    double v_Initial = 10.0;
    double v_Final = 2.5;
    double time_Interval = 1.0;

    time_Interval /= 60.0;

    double acceleration = calculation_Acceleration(v_Final, v_Initial, time_Interval);
    double time_to_rest = time_rest(v_Initial, acceleration);

    printf("The cyclist's constant acceleration is %.2f\n", acceleration);
    printf("The cyclist will take %.4f hours (%.2f min) to come to rest\n", time_to_rest, time_to_rest * 60);
}

/*

------> output :
The cyclist's constant acceleration is -450.00
The cyclist will take 0.0222 hours (1.33 min) to come to rest

*/