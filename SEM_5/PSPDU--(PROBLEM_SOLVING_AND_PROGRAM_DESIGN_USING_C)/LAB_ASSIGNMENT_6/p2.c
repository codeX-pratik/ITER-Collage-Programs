#include <stdio.h>

typedef struct {
    int atomic_number;
    char name[50];
    char symbol[5];
    char classification[50];
    double atomic_weight;
    int electron_shells[7];
} element_t;

void scan_element(element_t *element) {
    printf("Enter atomic number: ");
    scanf("%d", &element->atomic_number);
    
    printf("Enter name: ");
    scanf("%s", element->name);
    
    printf("Enter chemical symbol: ");
    scanf("%s", element->symbol);
    
    printf("Enter classification: ");
    scanf("%s", element->classification);
    
    printf("Enter atomic weight: ");
    scanf("%lf", &element->atomic_weight);
    
    printf("Enter the number of electrons in each shell (7 values): ");
    for (int i = 0; i < 7; i++) {
        scanf("%d", &element->electron_shells[i]);
    }
}

void print_element(const element_t *element) {
    printf("Atomic Number: %d\n", element->atomic_number);
    printf("Name: %s\n", element->name);
    printf("Symbol: %s\n", element->symbol);
    printf("Classification: %s\n", element->classification);
    printf("Atomic Weight: %.4f\n", element->atomic_weight);
    printf("Electron Shells: ");
    for (int i = 0; i < 7; i++) {
        printf("%d ", element->electron_shells[i]);
    }
    printf("\n");
}

int main() {
    element_t element;

    printf("Enter details for the element:\n");
    scan_element(&element);

    printf("\nElement details:\n");
    print_element(&element);

    return 0;
}

/*

Enter details for the element:
Enter atomic number: 11
Enter name: sodium
Enter chemical symbol: Na
Enter classification: alkali_metal
Enter atomic weight: 22.9898
Enter the number of electrons in each shell (7 values): 2 8 1 0 0 0 0

Element details:
Atomic Number: 11
Name: sodium
Symbol: Na
Classification: alkali_metal
Atomic Weight: 22.9898
Electron Shells: 2 8 1 0 0 0 0 

*/