#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
    if(vfork()==0 ){
        printf("1");
        _exit(0);
    } else {
        printf("2");
        printf("3");
    }
    return 0;
}

/*

output : 123

vfork() Call:
if (vfork() == 0): The vfork() system call creates a new process (child process). The vfork() function returns:
0 to the child process.
The child's Process ID (PID) to the parent process.
Unlike fork(), vfork() ensures that the parent process is suspended until the child process either calls _exit() or exec().
Child Process:
If vfork() returns 0, the child process executes the block of code within the if statement.
printf("1");: The child process prints 1.
_exit(0);: The child process calls _exit() to exit immediately, which allows the parent process to resume.
Parent Process:
If vfork() returns the child's PID, the parent process executes the else block.
printf("2");: The parent process prints 2.
printf("3");: The parent process prints 3.

*/