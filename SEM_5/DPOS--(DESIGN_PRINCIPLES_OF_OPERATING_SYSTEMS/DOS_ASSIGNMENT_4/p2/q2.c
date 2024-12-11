#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
    if(vfork()==0) {
        printf("1");
        _exit(0);
    } else
        printf("2");
        printf("3");
}


/*

output : 123


"1" is printed by the child process.
The child process exits.
The parent process resumes and prints "2".
The parent process prints "3".

*/