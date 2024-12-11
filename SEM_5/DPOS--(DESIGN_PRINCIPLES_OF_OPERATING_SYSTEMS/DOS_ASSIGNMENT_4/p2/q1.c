#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
    if(fork() == 0) 
        printf("1");
    else    
        printf("2");
    printf("3");
    return 0;
}



/*

output : 2133

Parent process prints "2"
Parent process continues and prints "3"
Child process prints "1"
Child process continues and prints "3"

*/