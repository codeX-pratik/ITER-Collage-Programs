#include <stdio.h>

void despensed(int bill) {
    int fifty = 0, twenty = 0, tens = 0;
    if (bill >= 50) {
        fifty = bill / 50;
        bill %= 50;
    }

    if (bill >= 20) {
        twenty = bill / 20;
        bill %= 20;
    }

    if (bill >= 10) {
        tens = bill / 10;
        bill %= 10;
    }

    printf("Number of 50 : %d\nNumber of 20 : %d\nNumber of 10 : %d", fifty, twenty, tens);
}

int main() {

    int amount;
    printf("Enter the bill amount : ");
    scanf("%d", &amount);

    if (amount > 0 && (amount % 10 == 0)) 
        despensed(amount);
    else 
        printf("Please enter a valid amount (multiple of 10)");

    return 0;
}

/*

Enter the bill amount : 230
Number of 50 : 4
Number of 20 : 1
Number of 10 : 1

*/