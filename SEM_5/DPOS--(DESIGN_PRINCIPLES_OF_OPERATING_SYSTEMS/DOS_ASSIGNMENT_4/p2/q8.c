#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
    int i=5;
    if(vfork()==0) {
        printf("Child: %d",i);
        _exit(0);
    } else {
        printf("Parent: %d",i);
    }
    return 0;
}

/*

int i = 5;: Initializes an integer variable i with the value 5
pid = vfork();: Creates a new process using vfork().
Unlike fork(), vfork() is designed to create a new process (child) that runs in the same address space as 
the parent process until it either calls _exit() or exec()
if (vfork() == 0): Checks if the current process is the child process.

Child Process:
printf("Child: %d", i);: Prints "Child: 5" because i is initialized to 5 and not modified in the child process.
_exit(0);: Exits the child process, allowing the parent process to resume.
else: Executes if the current process is the parent process.
Parent Process:
printf("Parent: %d", i);: Prints "Parent: 5" because i remains 5 in the parent process

*/