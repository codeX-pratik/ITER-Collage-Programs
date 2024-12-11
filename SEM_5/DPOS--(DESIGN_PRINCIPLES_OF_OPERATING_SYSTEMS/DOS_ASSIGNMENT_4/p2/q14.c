#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
    pid_t pid;
    int i=5;
    pid=vfork();
    if(pid==0) {
        printf("Child: %d",i);
        _exit(0);
    } else {
        i=i+1;
        printf("Parent: %d",i);
    }
    return 0;
}

/*

Main Function Initialization:
pid_t pid;: Declare a variable to store the process ID.
int i = 5;: Initialize an integer variable i with the value 5.

vfork() Call:
pid = vfork();: Create a new process using vfork(). Unlike fork(), vfork() creates a child process 
that runs in the same address space as the parent process until it either calls _exit() or exec(). During this time, the parent process is suspended.
vfork() returns:
0 to the child process.
The child's PID to the parent process.

Child Process Execution:
if (pid == 0): Checks if the current process is the child process.
printf("Child: %d", i);: Prints Child: 5 because the value of i is 5.
_exit(0);: Exits the child process, allowing the parent process to resume.

Parent Process Execution:
else: Executes if the current process is the parent process.
The parent process resumes after the child process exits.
i = i + 1;: Increments the value of i by 1, making i equal to 6.
printf("Parent: %d", i);: Prints Parent: 6.

*/