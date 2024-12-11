#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<unistd.h>

int main() {
    pid_t c1;
    int n=10;
    c1=fork( );
    if(c1==0) {
        printf(" Child\n");
        n=20;
        printf("n=%d\n",n);
    } else {
        wait(NULL);
        printf("Parent\n");
        printf("n=%d\n",n);
    }
    return 0;
}

/*

output : 
Child 
n=20 
Parent 
n=10


Main Function Initialization:
pid_t c1;: Declares a variable to store the process ID.
int n = 10;: Initializes an integer variable n with the value 10.

Forking the Process:
c1 = fork();: Creates a new process.
fork() returns 0 to the child process.
fork() returns the child's PID to the parent process.

Child Process Execution:
if (c1 == 0): Checks if the current process is the child process.
Prints Child.
Sets n = 20;: Changes the value of n to 20.
Prints n = 20.

Parent Process Execution:
else: Checks if the current process is the parent process.
wait(NULL);: Waits for the child process to finish.
Prints Parent.
Prints the value of n, which remains 10 in the parent process.

*/