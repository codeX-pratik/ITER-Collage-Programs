#include <stdio.h>

int main() {
    double x1, x2, y1, y2;
    double slope, x_mid, y_mid, slope_bisector, intercept_bisector;
    
    printf("Enter the coordinates of 1st point (x1, y1) : ");
    scanf("%lf %lf", &x1, &y1);

    printf("Enter the coordinates of 2nd point (x2, y2) : ");
    scanf("%lf %lf", &x2, &y2);

    if (x2 - x1 == 0) {
        scanf("The line segment is vertical and the perpendicular bisector will be horizontal\n");
        return 0;
    }

    slope = (y2 - y1) / (x2 - x1);
    x_mid = (x1 + x2) / 2.0;
    y_mid = (y1 + y2) / 2.0;

    if (slope != 0) {
        slope_bisector = -1 / slope;
    } else {
        printf("The line segment is horizontal and the perpendicular bisector will be vertical\n");
        return 0;
    }

    intercept_bisector = y_mid - slope_bisector * x_mid;
    printf("Original points: (%.2f, %.2f) and (%.2f, %.2f)\n", x1, y1, x2, y2);
    printf("Midpoint of the line segment: (%.2f, %.2f)\n", x_mid, y_mid);
    printf("Slope of the line segment: %.2f\n", slope);
    printf("Slope of the perpendicular bisector: %.2f\n", slope_bisector);
    printf("Equation of the perpendicular bisector: y = %.2fx + %.2f\n", slope_bisector, intercept_bisector);

    return 0;
}

/*

Enter the coordinates of 1st point (x1, y1) : 2.0 -4.0
Enter the coordinates of 2nd point (x2, y2) : 7.0 -2.0
Original points: (2.00, -4.00) and (7.00, -2.00)
Midpoint of the line segment: (4.50, -3.00)
Slope of the line segment: 0.40
Slope of the perpendicular bisector: -2.50
Equation of the perpendicular bisector: y = -2.50x + 8.25

*/