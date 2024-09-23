#include <stdio.h>

int leap(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        return 1;
    }
    return 0;
}

int day_number(int day, int month, int year) {
    int days_in_month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    if (leap(year)) {
        days_in_month[1] = 29;
    }

    int day_num = 0;
    for (int i = 0; i < month - 1; i++) {
        day_num += days_in_month[i];
    }
    day_num += day;

    return day_num;
}

int main() {
    int day, month, year;
    printf("Enter month: ");
    scanf("%d", &month);
    printf("Enter day: ");
    scanf("%d", &day);
    printf("Enter year: ");
    scanf("%d", &year);

    int day_num = day_number(day, month, year);
    printf("The day number for %d/%d/%d is: %d\n", month, day, year, day_num);

    return 0;
}

/*

------> output :
Enter month: 12
Enter day: 31
Enter year: 1996
The day number for 12/31/1996 is: 366

*/