#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<unistd.h>

int main() {
    pid_t pid;
    int i=5;
    pid=fork();
    i=i+1;
    if(pid==0) {
        printf("Child: %d",i);
    } else {
        wait(NULL);
        printf("Parent: %d",i);
    }
    return 0;
}

/*

output : Child: 6 Parent: 6

pid_t pid;: Declare a variable to store the process ID.
int i = 5;: Initialize an integer variable i with the value 5
pid = fork();: Create a new process. This line splits the program into two concurrent processes: the parent process and the child process.
i = i + 1;: Increment the value of i by 1. Now, i is 6 in both the parent and child processes.
if (pid == 0): Check if the current process is the child process.
Child Process: fork() returns 0 to the child process.
printf("Child: %d\n", i);: The child process prints "Child: 6".
else: If the current process is the parent process.
Parent Process: fork() returns the child's PID to the parent process.
wait(NULL);: The parent process waits for the child process to complete.
printf("Parent: %d\n", i);: The parent process prints "Parent: 6"

*/