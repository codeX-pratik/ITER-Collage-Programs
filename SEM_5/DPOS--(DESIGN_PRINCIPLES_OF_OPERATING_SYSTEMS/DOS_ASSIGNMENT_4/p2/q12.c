#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
    pid_t c1;
    int n=10;
    c1=vfork();
    if(c1==0) {
        printf(" Child\n");
        n=20;
        printf("n=%d\n",n);
        _exit(0);
    } else {
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
n=20

Main Function Initialization:
pid_t c1;: Declare a variable to store the process ID.
int n = 10;: Initialize an integer variable n with the value 10.

vfork() Call:
c1 = vfork();: Create a new process using vfork(). Unlike fork(), vfork() is designed to create a child process that runs in the same address space as the parent process until it either calls _exit() or exec().
vfork() returns:
0 to the child process.
The child's PID to the parent process.
The parent process is suspended until the child process either calls _exit() or exec().

Child Process Execution:
if (c1 == 0): Checks if the current process is the child process.
printf("Child\n");: Prints Child.
n = 20;: Changes the value of n to 20.
printf("n=%d\n", n);: Prints n = 20.
_exit(0);: Exits the child process, allowing the parent process to resume.

Parent Process Execution:
else: If the current process is the parent process.
The parent process resumes after the child process exits.
printf("Parent\n");: Prints Parent.
printf("n=%d\n", n);: Prints n. Due to vfork(), the variable n in the parent process will be affected by the changes made by the child process.

*/