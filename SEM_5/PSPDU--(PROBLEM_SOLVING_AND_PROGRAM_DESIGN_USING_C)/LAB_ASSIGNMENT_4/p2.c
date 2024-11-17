#include <stdio.h>

void check(int n, int *mul, int *evenORodd, int *prime) {
    *mul = isMultiple(n);
    *evenORodd = EvenOROdd(n);
    *prime = isPrime(n);
}

int isMultiple(int n) {
    return ((n % 7 == 0) && (n % 11 == 0) && (n % 13 == 0));
}

int EvenOROdd(int n) {
    int sum = 0;
    while (n > 0) {
        int r  = n % 10;
        sum += r;
        n /= 10;
    }
    return (sum % 2 == 0);
}

int isPrime(int n) {
    for (int i=2; i<n/2; i++) {
        if (n % i == 0) {
            return 0;
            break;
        }
    }
    return 1;
}

int main () {
    int n, a, b, c;
    printf("Enter a number : ");
    scanf("%d", &n);

    if (n > 0) {
        check(n, &a, &b, &c);

        if (a)
            printf("%d is divisible by 7, 11 and 13\n", n);
        else
            printf("%d is not divisible by 7, 11 and 13\n", n);

        if (b)
            printf("%d the sum is even\n", n);
        else 
            printf("%d the sum is even\n", n);

        if (c)
            printf("%d is a prime number\n", n);
        else
            printf("%d is not a prime number\n", n);
    } else {
        printf("Enter a valid number !!");
    }

    return 0;
}

/*

Enter a number : 13
13 is not divisible by 7, 11 and 13
13 the sum is even
13 is a prime number

*/