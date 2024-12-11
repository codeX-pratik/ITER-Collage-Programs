#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<unistd.h>

int main() {
    pid_t pid;
    int i=5;
    pid=fork();
    if(pid==0) {
        i=i+1;
        printf("Child: %d",i);
    } else { 
        wait(NULL);
        printf("Parent: %d",i);
    }
    return 0;
}

/*

output : Child: 6 Parent: 5

pid_t pid;: Declares a variable to store the process ID
int i = 5;: Initializes an integer variable i with the value 5
pid = fork();: Creates a new process (child process).
fork() returns:
0 to the child process.
Child's PID to the parent process.
if (pid == 0): Checks if the current process is the child process.

Child Process:
i = i + 1;: Increments the value of i by 1, making i equal to 6.
printf("Child: %d\n", i);: Prints "Child: 6".
else: Checks if the current process is the parent process.
Parent Process:
wait(NULL);: Waits for the child process to complete.
printf("Parent: %d\n", i);: Prints "Parent: 5"


*/