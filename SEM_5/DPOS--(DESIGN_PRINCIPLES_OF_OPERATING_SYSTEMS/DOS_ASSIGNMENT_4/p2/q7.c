#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
    int i=5; 
    if(fork()==0) {
        printf("Child: %d",i);
    } else {
        printf("Parent: %d",i);
    }
    return 0;
}

/*

output : Child: 5 Parent: 5

int i = 5;: Initializes an integer variable i with the value 5
fork() == 0: The fork() system call creates a new process (child process).
Child Process: If fork() returns 0, it indicates the current process is the child process.
Parent Process: If fork() returns the child's Process ID (PID), it indicates the current process is the parent process.
if (fork() == 0): Checks if the current process is the child process.
Child Process: Executes printf("Child: %d", i); and prints "Child: 5".
else: Executes if the current process is the parent process.
Parent Process: Executes printf("Parent: %d", i); and prints "Parent: 5".

*/