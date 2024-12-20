#include <stdio.h>

typedef struct {
    int month;
    int day;
    int year;
} date_t;

typedef struct {
    float capacity;
    float current_level;
} tank_t;

typedef struct {
    char make[50];
    char model[50];
    int odometer;
    date_t manufacture_date;
    date_t purchase_date;
    tank_t gas_tank;
} auto_t;

void scan_date(date_t *date) {
    printf("Enter date (MM DD YYYY): ");
    scanf("%d %d %d", &date->month, &date->day, &date->year);
}

void print_date(const date_t *date) {
    printf("%02d/%02d/%04d", date->month, date->day, date->year);
}

void scan_tank(tank_t *tank) {
    printf("Enter tank capacity and current fuel level (in gallons): ");
    scanf("%f %f", &tank->capacity, &tank->current_level);
}

void print_tank(const tank_t *tank) {
    printf("Tank Capacity: %.1f gallons, Current Fuel Level: %.1f gallons", tank->capacity, tank->current_level);
}

void scan_auto(auto_t *car) {
    printf("Enter make: ");
    scanf("%s", car->make);
    printf("Enter model: ");
    scanf("%s", car->model);
    printf("Enter odometer reading: ");
    scanf("%d", &car->odometer);

    printf("Enter manufacture date:\n");
    scan_date(&car->manufacture_date);

    printf("Enter purchase date:\n");
    scan_date(&car->purchase_date);

    printf("Enter gas tank details:\n");
    scan_tank(&car->gas_tank);
}

void print_auto(const auto_t *car) {
    printf("Make: %s\n", car->make);
    printf("Model: %s\n", car->model);
    printf("Odometer Reading: %d miles\n", car->odometer);
    printf("Manufacture Date: ");
    print_date(&car->manufacture_date);
    printf("\nPurchase Date: ");
    print_date(&car->purchase_date);
    printf("\n");
    print_tank(&car->gas_tank);
    printf("\n");
}

int main() {
    auto_t car1, car2;

    printf("Enter details for car 1:\n");
    scan_auto(&car1);

    printf("Enter details for car 2:\n");
    scan_auto(&car2);

    printf("\nCar 1 details:\n");
    print_auto(&car1);

    printf("\nCar 2 details:\n");
    print_auto(&car2);

    return 0;
}

/*

Enter details for car 1:
Enter make: mercury  
Enter model: sable
Enter odometer reading: 99842
Enter manufacture date:
Enter date (MM DD YYYY): 1 18 2001
Enter purchase date:
Enter date (MM DD YYYY): 5 30 1991
Enter gas tank details:
Enter tank capacity and current fuel level (in gallons): 16.4 12.5
Enter details for car 2:
Enter make: mazda       
Enter model: Navajo
Enter odometer reading: 123961
Enter manufacture date:
Enter date (MM DD YYYY): 2 20 1993           
Enter purchase date:
Enter date (MM DD YYYY): 5 30 1993
Enter gas tank details:
Enter tank capacity and current fuel level (in gallons): 19.3 16.7

Car 1 details:
Make: mercury
Model: sable
Odometer Reading: 99842 miles
Manufacture Date: 01/18/2001
Purchase Date: 05/30/1991
Make: mazda
Model: Navajo
Odometer Reading: 123961 miles
Manufacture Date: 02/20/1993
Purchase Date: 05/30/1993
Tank Capacity: 19.3 gallons, Current Fuel Level: 16.7 gallons

*/