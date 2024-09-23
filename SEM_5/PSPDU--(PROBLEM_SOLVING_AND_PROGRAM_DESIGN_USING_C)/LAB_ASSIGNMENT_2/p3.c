#include <stdio.h>

int main() {
    int pollutant_number;
    float grams_per_mile, emission_limit;
    int odometer_reading;

    float emission_limits_first_50000[] = {3.4, 0.31, 0.4, 0.25};
    float emission_limits_second_50000[] = {4.2, 0.39, 0.5, 0.31};

    printf("(1) Carbon monoxide\n");
    printf("(2) Hydrocarbons\n");
    printf("(3) Nitrogen oxides\n");
    printf("(4) Nonmethane hydrocarbons\n");

    printf("Enter pollutant number: ");
    scanf("%d", &pollutant_number);

    if (pollutant_number < 1 || pollutant_number > 4) {
        printf("Invalid pollutant number.\n");
        return 1;
    }

    printf("Enter number of grams emitted per mile: ");
    scanf("%f", &grams_per_mile);

    printf("Enter odometer reading: ");
    scanf("%d", &odometer_reading);

    if (odometer_reading <= 50000) {
        emission_limit = emission_limits_first_50000[pollutant_number - 1];
    } else if (odometer_reading <= 100000) {
        emission_limit = emission_limits_second_50000[pollutant_number - 1];
    } else {
        printf("Odometer reading exceeds 100,000 miles. No data available.\n");
        return 1;
    }

    if (grams_per_mile > emission_limit) {
        printf("Emissions exceed permitted level of %.2f grams/mile.\n", emission_limit);
    } else {
        printf("Emissions are within the permitted level of %.2f grams/mile.\n", emission_limit);
    }

    return 0;
}

/*

------> output :
(1) Carbon monoxide
(2) Hydrocarbons
(3) Nitrogen oxides
(4) Nonmethane hydrocarbons
Enter pollutant number: 2
Enter number of grams emitted per mile: 0.35
Enter odometer reading: 40112
Emissions exceed permitted level of 0.31 grams/mile.

*/