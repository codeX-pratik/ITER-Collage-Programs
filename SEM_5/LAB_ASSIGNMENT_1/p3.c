#include <stdio.h>

int main() {
    double take_Off_Speed_kmp;
    printf("Enter the take off speed of the jet in km/h : ");
    scanf("%lf", &take_Off_Speed_kmp);

    double distance;
    printf("Enter the distance which is jet accelerates in meters : ");
    scanf("%lf", &distance);

    double take_Off_Speed_mps = take_Off_Speed_kmp * 1000.0 / 3600.0;

    // a = v^2 / 2 * s
    double acceleration = take_Off_Speed_mps * take_Off_Speed_mps / (2 * distance);

    // t  = v / a
    double time = take_Off_Speed_mps / acceleration;

    printf("The acceleration of the jet is %.2f m/s^2\n", acceleration);
    printf("The time required to reach takeoff speed is %.2f seconds\n", time);
    return 0;
}

/*

------> output :
Enter the take off speed of the jet in km/h : 278
Enter the distance which is jet accelerates in meters : 94
The acceleration of the jet is 31.72 m/s^2
The time required to reach takeoff speed is 2.43 seconds

*/