#include <stdio.h>

int f(int x) {
    if (x <= 0) {
        return 0;
    } else {
        return f(x - 1) + 2;
    }
}

int main() {
    int x;
    printf("Enter a value for x: ");
    scanf("%d", &x);

    int result = f(x);
    printf("f(%d) = %d\n", x, result);
    printf("Generated set of numbers: ");
    for (int i = 0; i <= x; i++) {
        printf("%d ", f(i));
    }
    printf("\n");
    return 0;
}

/*

Enter a value for x: 5
f(5) = 10
Generated set of numbers: 0 2 4 6 8 10 

*/