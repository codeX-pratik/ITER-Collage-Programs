#include <stdio.h>
#define NUM_BRANDS 4

int main() {
    int inventory[NUM_BRANDS];
    int brand_Id, amount;
    char check;
    printf("Enter the starting case inventory for each brand (Piels, Coors, Bud, Iron City):\n");
    for (int i = 0; i < NUM_BRANDS; i++) {
        printf("Brand %d: ", i + 1);
        scanf("%d", &inventory[i]);
    }

    do {
        printf("Enter transation (Brand ID and amount) : ");
        scanf("%d %d", &brand_Id, &amount);

        if(brand_Id < 1 || brand_Id > NUM_BRANDS) {
            printf("Invalid Brand ID");
            continue;
        }

        switch(brand_Id) {
            case 1 : inventory[0] += amount; break;
            case 2 : inventory[1] += amount; break;
            case 3 : inventory[2] += amount; break;
            case 4 : inventory[3] += amount; break;
            default : printf("Invalid Brand Id\n"); break;
        }

        printf("do you want to enter another transaction ? (y/n) : ");
        scanf(" %c", &check);
    } while (check == 'y');

    printf("\nFinal inventory for each brand:\n");
    for (int i = 0; i < NUM_BRANDS; i++) {
        printf("Brand %d: %d cases\n", i+1, inventory[i]);
    }
    return 0;
}

/*

Enter the starting case inventory for each brand (Piels, Coors, Bud, Iron City):
Brand 1: 8
Brand 2: 5
Brand 3: 2
Brand 4: 3
Enter transation (Brand ID and amount) : 1 -3
do you want to enter another transaction ? (y/n) : y     
Enter transation (Brand ID and amount) : 2 3 
do you want to enter another transaction ? (y/n) : y     
Enter transation (Brand ID and amount) : 3 3
do you want to enter another transaction ? (y/n) : y     
Enter transation (Brand ID and amount) : 4 2
do you want to enter another transaction ? (y/n) : n     

Final inventory for each brand:
Brand 1: 5 cases
Brand 2: 8 cases
Brand 3: 5 cases
Brand 4: 5 cases

*/