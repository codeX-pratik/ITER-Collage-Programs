#include <stdio.h>
#include <math.h>

#define SIZE 20
#define END -999

void inputArray(int arr[], int *n) {
    int value;
    *n = 0;
    while (*n < SIZE) {
        printf("Enter a value (or %d to end): ", END);
        scanf("%d", &value);
        if (value == END) {
            break;
        }
        arr[*n] = value;
        (*n)++;
    }
}

void displayArrays(int x[], int y[], int z[], int n) {
    printf(" X    Y    Z (X * Y)\n");
    for (int i = 0; i < n; i++) {
        printf("%4d %4d %4d\n", x[i], y[i], z[i]);
    }
}

int main() {
    int x[SIZE], y[SIZE], z[SIZE];
    int n = 0;
    
    printf("Input values for array X:\n");
    inputArray(x, &n);
    
    printf("Input values for array Y:\n");
    inputArray(y, &n);

    for (int i = 0; i < n; i++) {
        z[i] = x[i] * y[i];
    }

    displayArrays(x, y, z, n);

    int sumZ = 0;
    for (int i = 0; i < n; i++) {
        sumZ += z[i];
    }
    double sqrtSumZ = sqrt(sumZ);
    printf("The square root of the sum of Z: %.2f\n", sqrtSumZ);

    return 0;
}


/*

Input values for array X:
Enter a value (or -999 to end): 1
Enter a value (or -999 to end): 2 
Enter a value (or -999 to end): 3
Enter a value (or -999 to end): 4
Enter a value (or -999 to end): 5
Enter a value (or -999 to end): -999
Input values for array Y:
Enter a value (or -999 to end): 1
Enter a value (or -999 to end): 2
Enter a value (or -999 to end): 3
Enter a value (or -999 to end): 4
Enter a value (or -999 to end): 5
Enter a value (or -999 to end): -999
 X    Y    Z (X * Y)
   1    1    1
   2    2    4
   3    3    9
   4    4   16
   5    5   25
The square root of the sum of Z: 7.42

*/