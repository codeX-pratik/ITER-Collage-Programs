#include<stdio.h>
#include<math.h>

double do_next_op(char operation, double operand, double result) {
    switch (operation) {
        case '+' : return result + operand;
        case '-' : return result - operand;
        case '*' : return result * operand;
        case '/' : if (operand == 0) {
                        printf("Error can not divided by zero");
                        return result;
                    }
                    return result / operand;
        case '^' : return pow(result, operand);
        default : printf("Invalid operator '%c'\n", operation);
                  return result;
    }
}

int main() {
    char operation;
    double operand, result;


    do {
    printf("Enter operation and operand : ");
    scanf("%s %lf", &operation, &operand);

    if (operation == 'q') {
        printf("Final result is %.2lf\n", result);
        break;
    }

    if (operation == ' ' && operand >= 0) {
        printf("Invalid input !!");
    }

    result = do_next_op(operation, operand, result);
    printf("result so far is %.2lf\n", result);

    } while (1);

    return 0;
}

/*

Enter operation and operand : + 5
result so far is 5.00
Enter operation and operand : ^ 2
result so far is 25.00
Enter operation and operand : / 2
result so far is 12.50
Enter operation and operand : q 0
Final result is 12.50

*/