#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
    int i=5;
    if(fork()==0)
        i=i+1;
    else
        i = i - 1;
    printf("%d",i);
    return 0;
}


/*

output : 46

Main Function Initialization:
int i = 5;: Initializes an integer variable i with the value 5.

Forking the Process:
if (fork() == 0): The fork() system call creates a new process (child process). It returns:
0 to the child process.
The child's Process ID (PID) to the parent process.

Conditional Check:
Child Process:
If fork() returns 0, the child process executes the block of code within the if statement.
i = i + 1;: The child process increments i by 1, making i equal to 6.
Parent Process:
If fork() returns the child's PID (non-zero), the parent process executes the else block.
i = i - 1;: The parent process decrements i by 1, making i equal to 4.

Printing i:
Both the parent and child processes execute printf("%d", i);, but with different values of i:
Child Process: Prints 6.
Parent Process: Prints 4

*/