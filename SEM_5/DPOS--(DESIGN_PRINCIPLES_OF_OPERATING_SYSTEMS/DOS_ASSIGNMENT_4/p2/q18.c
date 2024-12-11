#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
    int j,i=5;
    for(j=1;j<3;j++) {
        if(fork()!=0) {
            i = i - 1;
            break;
        }
    }
    fprintf(stderr,"%d",i);
    return 0;
}

/*

First Iteration (j = 1):
Parent Process:
fork() creates a child process (C1).
Parent Process:
fork() returns child's PID (non-zero).
Decrements i to 4.
Breaks out of the loop.
Child Process (C1):
fork() returns 0.
Continues to the next iteration of the loop (j = 2).

Second Iteration (j = 2):
Child Process (C1):
fork() creates another child process (C2).
Child Process (C1):
fork() returns child's PID (non-zero).
Decrements i to 4.
Breaks out of the loop.
Child Process (C2):
fork() returns 0.
Continues past the loop (no further iterations).

*/