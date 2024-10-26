#include <stdio.h>

double fast_food_billions(int year);

int main() {
    int year;

    printf("Enter a year after 2005 to predict fast food charges (enter a year before 2005 to stop):\n");

    while (1) {
        printf("Year: ");
        scanf("%d", &year);

        if (year < 2005) {
            printf("Program stopped.\n");
            break;
        }

        double prediction = fast_food_billions(year);
        printf("Predicted fast food charges in %d: $%.2f billion\n", year, prediction);
    }

    return 0;
}

double fast_food_billions(int year) {
    int t = year - 2005;    // Calculate the years since 2005
    return 33.2 + 16.8 * t; // formula: F(t) = 33.2 + 16.8 * t
}

/*

------> Output:
Enter a year after 2005 to predict fast food charges (enter a year before 2005 to stop):
Year: 2024
Predicted fast food charges in 2024: $352.40 billion
Year: -1
Program stopped.

*/