#include <stdio.h>

#define NUM_BRANDS 4

void getStartingInventory(int inventory[]);
void processTransactions(int inventory[]);
void displayFinalInventory(const int inventory[]);

int main() {
    int inventory[NUM_BRANDS] = {0};

    getStartingInventory(inventory);
    processTransactions(inventory);
    displayFinalInventory(inventory);

    return 0;
}

void getStartingInventory(int inventory[]) {
    printf("Enter the starting case inventory for each brand (Piels, Coors, Bud, Iron City):\n");
    for (int i = 0; i < NUM_BRANDS; i++) {
        printf("Brand %d: ", i + 1);
        scanf("%d", &inventory[i]);
    }
}

void processTransactions(int inventory[]) {
    int brandID, amount;

    printf("\nEnter transactions (brand ID and amount). Enter -1 to stop:\n");
    while (1) {
        printf("Brand ID: ");
        scanf("%d", &brandID);

        if (brandID == -1) {
            break;
        }

        printf("Amount: ");
        scanf("%d", &amount);

        if (brandID >= 1 && brandID <= NUM_BRANDS) {
            inventory[brandID - 1] += amount; 
        } else {
            printf("Invalid brand ID. Please enter a number between 1 and 4.\n");
        }
    }
}

void displayFinalInventory(const int inventory[]) {
    const char *brands[] = {"Piels", "Coors", "Bud", "Iron City"};
    
    printf("\nFinal inventory for each brand:\n");
    for (int i = 0; i < NUM_BRANDS; i++) {
        printf("%s: %d cases\n", brands[i], inventory[i]);
    }
}
