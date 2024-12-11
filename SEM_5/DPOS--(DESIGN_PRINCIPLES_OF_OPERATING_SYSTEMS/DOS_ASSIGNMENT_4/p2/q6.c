#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
    pid_t pid;
    int i=5;
    pid=vfork();
    if(pid==0) {
        i=i+1;
        printf("Child: %d",i);
        _exit(0);
    } else {
        printf("Parent: %d",i);
    }
    return 0;
}

/*

pid_t pid;: Declare a variable to store the process ID.
int i = 5;: Initialize an integer variable i with the value 5.
pid = vfork();: Create a new process using vfork(). Unlike fork(), vfork() creates a child process 
that runs in the same address space as the parent process until it either calls _exit() or exec().
vfork() returns:
0 to the child process.
The child's PID to the parent process.
Shared Address Space: Because vfork() shares the same address space, any changes to i made by the child process affect the parent’s view of i as well.
i = i + 1;: Increment the value of i by 1, making i equal to 6.
printf("Child: %d\n", i);: Print "Child: 6".
_exit(0);: Exit the child process, allowing the parent process to resume.
After Child Exits: The parent process resumes after the child process exits.
printf("Parent: %d\n", i);: Print "Parent: 6" because the value of i was modified by the child process due to the shared address space

*/