#include <stdio.h>

int main() {
    int population;
    printf("Enter the total population : ");
    scanf("%d", &population);

    int new_Flush_Model = 2;
    int old_Flush_Model = 15;
    int people_Per_Tiolet  = 3;
    double flush_Per_Day = 14.0;
    double toilet_Install_Cost = 150.0;

    int number_Of_Toilets = population / people_Per_Tiolet;
    double water_Saved_Per_Day = number_Of_Toilets * flush_Per_Day * (old_Flush_Model - new_Flush_Model);
    double new_Toilet_Install_Cost = number_Of_Toilets * toilet_Install_Cost;

    printf("Water saved per day : %.2f liters.\n", water_Saved_Per_Day);
    printf("Total cost to install new toilets : $%.2f\n", new_Toilet_Install_Cost);
    return 0;
}

/*

------> output :
Enter the total population : 900
Water saved per day : 54600.00 liters.
Total cost to install new toilets : $45000.00

*/