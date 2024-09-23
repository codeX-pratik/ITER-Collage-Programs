#include <stdio.h>

int compute_baking_time(int base_time, int is_double_loaf) {
    if (is_double_loaf) {
        return base_time + (base_time / 2);
    }
    return base_time;
}

void display_steps(char bread_type, int is_double_loaf, int is_manual_baking) {
    int primary_kneading = (bread_type == 'W') ? 15 : 20;
    int primary_rising = 60;
    int secondary_kneading = (bread_type == 'W') ? 18 : 33;
    int secondary_rising = (bread_type == 'W') ? 20 : 30;
    int loaf_shaping = 2;
    int final_rising = 75;
    int baking = (bread_type == 'W') ? 45 : 35;
    int cooling = 30;

    printf("Primary kneading: %d minutes\n", primary_kneading);
    printf("Primary rising: %d minutes\n", primary_rising);
    printf("Secondary kneading: %d minutes\n", secondary_kneading);
    printf("Secondary rising: %d minutes\n", secondary_rising);
    printf("Loaf shaping: %d seconds\n", loaf_shaping);

    if (is_manual_baking) {
        printf("Your manual breading making process is ongoing, please wait\nThank you\n");
        return;
    }

    printf("Final rising: %d minutes\n", final_rising);
    int final_baking_time = compute_baking_time(baking, is_double_loaf);
    printf("Baking: %d minutes\n", final_baking_time);
    printf("Cooling: %d minutes\n", cooling);
}

int main() {
    char bread_type;
    char loaf_size;
    char manual_baking;

    printf("Enter bread type (W for White, S for Sweet): ");
    scanf(" %c", &bread_type);

    if (bread_type != 'W' && bread_type != 'S') {
        printf("Invalid bread type!\n");
        return 1;
    }

    printf("Is the loaf size double? (Y for Yes, N for No): ");
    scanf(" %c", &loaf_size);

    printf("Is the baking manual? (Y for Yes, N for No): ");
    scanf(" %c", &manual_baking);

    int is_double_loaf = (loaf_size == 'Y') ? 1 : 0;
    int is_manual_baking = (manual_baking == 'Y') ? 1 : 0;

    display_steps(bread_type, is_double_loaf, is_manual_baking);

    return 0;
}


/*

------> output :
Enter bread type (W for White, S for Sweet): W
Is the loaf size double? (Y for Yes, N for No): N
Is the baking manual? (Y for Yes, N for No): Y
Primary kneading: 15 minutes
Primary rising: 60 minutes
Secondary kneading: 18 minutes
Secondary rising: 20 minutes
Loaf shaping: 2 seconds
Your manual breading making process is ongoing, please wait
Thank you

Enter bread type (W for White, S for Sweet): S
Is the loaf size double? (Y for Yes, N for No): Y
Is the baking manual? (Y for Yes, N for No): N
Primary kneading: 20 minutes
Primary rising: 60 minutes
Secondary kneading: 33 minutes
Secondary rising: 30 minutes
Loaf shaping: 2 seconds
Final rising: 75 minutes
Baking: 52 minutes
Cooling: 30 minutes

*/








// #include <stdio.h>

// int computeBackingTime(int backingTime, int isLoaf) {
//     if (isLoaf == 1) {
//         return backingTime + (backingTime / 2);
//     }
//     return backingTime;
// }

// void displaySteps(char breadType, int isDoubleLoaf, int isManual) {
//     int primaryKneading = (breadType == 'W') ? 15 : 20;
//     int primaryRising = 60;
//     int secondaryKneading = (breadType == 'W') ? 18 : 33;
//     int secondayRising = (breadType == 'W') ? 20 : 30;
//     int loafShaping = 2;
//     int finalRising = 75;
//     int backing = (breadType == 'W') ? 45 : 35;
//     int cooling = 30;

//     printf("Primary Kneading : %d minutes\n", primaryKneading);
//     printf("Primary Rising : %d minutes\n", primaryRising);
//     printf("Secondary Kneading : %d minutes\n", secondaryKneading);
//     printf("Secondary Rising : %d minutes\n", secondayRising);
//     printf("Loaf Shaping : %d seconds\n", loafShaping);

//     if (isManual == 1) {
//         printf("Your manual breading making process is ongoing, please wait\nThank you");
//         return;
//     }

//     printf("Final Rising : %d minutes\n", finalRising);
//     printf("Backing : %d minutes\n", computeBackingTime(backing, isDoubleLoaf));
//     printf("Cooling : %d mintues\n", cooling);
// }

// int main() {
//     char breadType; 
//     char loafSize; 
//     char manualBacking;
//     printf("Enter the bread type (W for white and S for sweet) : ");
//     scanf("%c", &breadType);

//     if (breadType != 'W' && breadType != 'S') {
//         printf("Bread type not found,\nInvalid input !!\n");
//         return 1;
//     }

//     printf("Is the loaf size double ? (Y for yes and N for no) : ");
//     scanf("%c\n", &loafSize);
//     int isLoafBread = loafSize == 'Y' ? 1 : 0;
    

//     printf("Is the bread manual backing ? (Y for yes and N for no) : ");
//     scanf("%c\n", &manualBacking);
//     int isManualBacking = manualBacking == 'Y' ? 1 : 0;


//     printf("%d %d\n", isLoafBread, isManualBacking);

//     displaySteps(breadType, isLoafBread, isManualBacking);
// }