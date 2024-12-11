#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<unistd.h>

int main() {
    int j,i=5;
    for(j=1;j<3;j++) {
        if(fork()==0) {
            i=i+1;
            break;
        } else
            wait(NULL);

    }
    printf("%d",i);
    return 0;
}

/*

Initial Setup:
int j, i = 5;: Initializes i to 5 and declares j.

For Loop:
for (j = 1; j < 3; j++): Loop runs from j = 1 to j < 3.

First fork() Call:
if (fork() == 0): First fork() creates a child process.
Child Process (C1):
Increments i to 6 (i = i + 1).
Breaks the loop due to break;.
Parent Process:
Waits for the child process to finish using wait(NULL);.
Continues to the next iteration of the loop.

Second fork() Call:
Parent Process:
if (fork() == 0): Second fork() creates another child process (C2).
Child Process (C2):
Inherits i as 5 from the parent.
Increments i to 6.
Breaks the loop due to break;.
Parent Process:
Waits for the child process (C2) to finish using wait(NULL);.
Continues to the end of the loop.

Third Process:
Child Process from the First fork() (C1):
Prints i as 6.
Child Process from the Second fork() (C2):
Prints i as 6.
Parent Process:
After both child processes finish, prints i as 5.

*/