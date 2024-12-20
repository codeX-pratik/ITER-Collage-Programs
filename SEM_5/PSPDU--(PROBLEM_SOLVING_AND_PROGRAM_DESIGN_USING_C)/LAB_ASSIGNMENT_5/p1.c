#include<stdio.h>

int main() {
    int upc[12];
    int odd_sum = 0, even_sum = 0, total_sum, compute_check_digit;

    printf("Enter the 12 digit barcode separate by space : ");
    for(int i=0; i<12; i++) {
        scanf("%d", &upc[i]);
    }

    for(int i=0; i<12; i+=2) {
        odd_sum += upc[i];
    }
    odd_sum *= 3;

    for(int i=1; i<11; i+=2) {
        even_sum += upc[i];
    }

    total_sum = odd_sum + even_sum;
    if (total_sum % 10 == 0) {
        compute_check_digit = 0;
    } else {
        compute_check_digit = 10 - (total_sum % 10);   
    }

    if (compute_check_digit == upc[11]) {
        printf("Valid Barcode\n");
    } else {
        printf("Error in Barcode\n");
    }
    return 0;
}

/*

Enter the 12 digit barcode separate by space : 0 7 9 4 0 0 8 0 4 5 0 1
Valid Barcode

*/