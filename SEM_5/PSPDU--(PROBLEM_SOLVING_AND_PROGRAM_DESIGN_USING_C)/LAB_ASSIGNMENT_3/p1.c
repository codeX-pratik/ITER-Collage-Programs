#include <stdio.h>
#include <math.h>

int main() {
    int N;
    float sum = 0, sum_square = 0, num, smallest, largest, average, range, stddev;

    printf("Enter the number of values : ");
    scanf("%d", &N);

    if (N < 0) {
        printf("The number of valus must be greater than 0.\n");
        return 1;
    }

    printf("Enter the 1 value : ");
    scanf("%f", &num);
    smallest = largest = num;
    sum = num;
    sum_square = pow(num, 2);

    for(int i=2; i<=N; i++) {
        printf("Enter the %d value : ", i);
        scanf("%f", &num);
        sum += num;
        sum_square += pow(num, 2);

        if (num < smallest) {
            smallest = num;
        }

        if (num > largest) {
            largest = num;
        }
    }

    average = sum / N;
    range = largest - smallest;
    stddev = sqrt((sum_square / N) - pow(average, 2));
    printf("Smallest number : %.2f\n", smallest);
    printf("Largest number : %.2f\n", largest);
    printf("Average : %.2f\n", average);
    printf("Range : %.2f\n", range);
    printf("Standard Deviation : %.2f\n", stddev);

    return 0;
}

/*

------> Output:
Enter the number of values : 5
Enter the 1 value : 8
Enter the 2 value : 1
Enter the 3 value : 3
Enter the 4 value : 5
Enter the 5 value : 7
Smallest number : 1.00
Largest number : 8.00
Average : 4.80
Range : 7.00
Standard Deviation : 2.56

*/