#include <stdio.h>
#include <math.h>

double drag_Force(double CD, double A, double p, double v) {
    return 0.5 * CD * A * p * pow(v, 2);
}

int main() {
    double CD, A, p = 1.23, velocity;

    printf("Enter the drag coefficient (CD) : ");
    scanf("%lf", &CD);
    printf("Enter the projected Area (A) : ");
    scanf("%lf", &A);

    for (int i=0; i<=40 ; i += 5) {
        velocity = i;
        double dragForce = drag_Force(CD, A, p, velocity);
        printf("For velocity %.0lf, the drag force is %.2lf\n", velocity, dragForce);
    }

    return 0;
}

/*

Enter the drag coefficient (CD) : 3
Enter the projected Area (A) : 5
For velocity 0, the drag force is 0.00
For velocity 5, the drag force is 230.62
For velocity 10, the drag force is 922.50
For velocity 15, the drag force is 2075.62
For velocity 20, the drag force is 3690.00
For velocity 25, the drag force is 5765.62
For velocity 30, the drag force is 8302.50
For velocity 35, the drag force is 11300.62
For velocity 40, the drag force is 14760.00

*/