#include <stdio.h>
#include <string.h>

void deblank(char *output, const char *input) {
    while (*input != '\0') {
        if (*input != ' ') {
            *output = *input;
            output++;
        }
        input++;
    }
    *output = '\0';
}

int main() {
    const char input[50];
    char output[50];

    printf("Enter a string : ");
    scanf("%[^\n]%*c", input);
    
    deblank(output, input);
    
    printf("Original: %s\n", input);
    printf("Deblanked: %s\n", output);
    
    return 0;
}

/*

Enter a string : C programming language
Original: C programming language
Deblanked: Cprogramminglanguage

*/