#include <stdio.h>

void compassPointer(double direction) {
    double angle;

    if (direction < 0 || direction > 360) {
        printf("Invalid direction Inputted !!");
        return;
    }

    if (direction >= 0 && direction <= 90) {
        printf("North %.1f degrees East", direction);
    } else if (direction > 90 && direction <= 180) {
        angle = 180.0 - direction;
        printf("South %.1f degrees East", angle);
    } else if (direction > 180 && direction <= 270) {
        angle = direction - 180;
        printf("South %.1f degrees West", angle);
    } else if (direction > 270 && direction <= 360) {
        angle = 360 - direction;
        printf("North %.1f degrees West", angle);
    }
}

int main() {
    double direction;
    printf("Enter the compass heading direction (0 - 360) : ");
    scanf("%lf", &direction);

    compassPointer(direction);
    return 0;
}

/*

------> output :
Enter the compass heading direction (0 - 360) : -8
Invalid direction Inputted !!

Enter the compass heading direction (0 - 360) : 500
Invalid direction Inputted !!

Enter the compass heading direction (0 - 360) : 110
South 70.0 degrees East

*/