#include <stdio.h>

double celsius_at_depth(double depth) {
    return 10 * depth + 20;
}

double fahrenheit(double celsius) {
    return 1.8 * celsius + 32;
}

int main() {
    double depth;
    printf("Enter the depth of the earth (in km) : ");
    scanf("%lf", &depth);

    double temp_celsius = celsius_at_depth(depth);
    double temp_fahrenheit = fahrenheit(temp_celsius);

    printf("The temperature in celcius is %.2f C°\n", temp_celsius);
    printf("The temperature in fahrenheit is %.2f F°\n", temp_fahrenheit);
}

/*

------> output :
Enter the depth of the earth (in km) : 5
The temperature in celcius is 70.00 C°
The temperature in fahrenheit is 158.00 F°

*/