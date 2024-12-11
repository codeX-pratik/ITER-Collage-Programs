#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<unistd.h>

int main() {
    if(fork()==0) {
        printf("1");
    } else {
        wait(NULL);
        printf("2");
        printf("3");
    }
    return 0;
}

/*

output : 123

Forking the Process:
if (fork() == 0): The fork() system call creates a new process.
Returns 0 to the child process.
Returns the child's PID to the parent process.
Child Process:
If fork() returns 0, the child process executes the block of code within the if statement.
The child process prints 1.
Parent Process:
If fork() returns the child's PID, the parent process executes the else block.
The parent process waits for the child process to complete using wait(NULL);.
After the child process completes, the parent process prints 2 and then 3.


Why You Got 123:
The sequence 123 can happen if the following sequence occurs:
Child Process:
The child process prints 1.
The child process completes very quickly and exits.
Parent Process:
The parent process, which is waiting for the child to complete, proceeds to print 2 and then 3.

*/