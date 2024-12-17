#include <stdio.h>
#include <stdlib.h>

void mergeArrays(double *arr1, int size1, double *arr2, int size2, double *result, int *resultSize) {
    int i = 0, j = 0, k = 0;

    while (i < size1 && j < size2) {
        if (arr1[i] < arr2[j]) {
            if (k == 0 || result[k - 1] != arr1[i]) {
                result[k++] = arr1[i];
            }
            i++;
        } else if (arr1[i] > arr2[j]) {
            if (k == 0 || result[k - 1] != arr2[j]) {
                result[k++] = arr2[j];
            }
            j++;
        } else {
            if (k == 0 || result[k - 1] != arr1[i]) {
                result[k++] = arr1[i];
            }
            i++;
            j++;
        }
    }

    while (i < size1) {
        if (k == 0 || result[k - 1] != arr1[i]) {
            result[k++] = arr1[i];
        }
        i++;
    }

    while (j < size2) {
        if (k == 0 || result[k - 1] != arr2[j]) {
            result[k++] = arr2[j];
        }
        j++;
    }

    *resultSize = k;
}

int main() {
    double arr1[] = {-10.5, -1.8, 3.5, 6.3, 7.2};
    double arr2[] = {-1.8, 3.1, 6.3};
    int size1 = sizeof(arr1) / sizeof(arr1[0]);
    int size2 = sizeof(arr2) / sizeof(arr2[0]);

    double result[size1 + size2];
    int resultSize;

    mergeArrays(arr1, size1, arr2, size2, result, &resultSize);

    printf("Merged array: ");
    for (int i = 0; i < resultSize; i++) {
        printf("%f ", result[i]);
    }
    printf("\n");

    return 0;
}

/*

Merged array: -10.5 -1.8 3.1 3.5 6.3 7.2

*/