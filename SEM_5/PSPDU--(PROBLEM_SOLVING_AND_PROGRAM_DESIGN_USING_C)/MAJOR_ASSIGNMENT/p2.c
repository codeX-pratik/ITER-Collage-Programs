#include<stdio.h>

int within_x_percent(double ref, double data, double x) {
    double lower = ref - (x / 100.0) * ref;
    double upper = ref + (x / 100.0) * ref;
    return (data >= lower && data <= upper) ? 1 : 0;
}

void identify_substance(double boiling_point) {
    if (within_x_percent(100, boiling_point, 5)) {
        printf("Substance: Water\n");
    } else if (within_x_percent(357, boiling_point, 5)) {
        printf("Substance: Mercury\n");
    } else if (within_x_percent(1187, boiling_point, 5)) {
        printf("Substance: Copper\n");
    } else if (within_x_percent(2193, boiling_point, 5)) {
        printf("Substance: Silver\n");
    } else if (within_x_percent(2660, boiling_point, 5)) {
        printf("Substance: Gold\n");
    } else {
        printf("Substance Unknown\n");
    }
}

int main() {

    double data;
    printf("Enter the observes boiling point (in celsius) : ");
    scanf("%lf", &data);

    identify_substance(data);

    return 0;
}

/*

Enter the observes boiling point (in celsius) : 350
Substance: Mercury

*/