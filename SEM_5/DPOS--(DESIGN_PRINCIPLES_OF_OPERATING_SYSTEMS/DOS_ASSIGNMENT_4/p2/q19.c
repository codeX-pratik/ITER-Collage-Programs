#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
    if(fork() == 0)
        if(fork())
            printf("1\n");
    
    return 0;
}

/*

output : 1

First fork() Call:
if (fork() == 0): The fork() system call creates a new process.
Parent Process: If fork() returns a non-zero value (child's PID), the parent process skips the inner if statement and proceeds to return 0.
Child Process: If fork() returns 0, the child process proceeds to execute the inner if statement.

Second fork() Call:
if (fork()): The child process created by the first fork() calls fork() again.
Parent Process: If the second fork() returns a non-zero value (child's PID), the child process (which is now a parent) prints 1.
Child Process: If the second fork() returns 0, the child process does not print anything and skips the print statement
*/