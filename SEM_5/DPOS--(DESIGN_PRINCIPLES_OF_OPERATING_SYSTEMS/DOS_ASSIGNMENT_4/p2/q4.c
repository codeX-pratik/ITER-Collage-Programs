#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
    pid_t pid;
    int i=5;
    pid=vfork();
    i=i+1;
    if(pid==0) {
        printf("Child: %d",i);
        _exit(0);
    } else {
        printf("Parent: %d",i);
    }
    return 0;
}

/*

output : Child: 6 Parent: 7

pid_t pid;: Declare a variable to store the process ID
int i = 5;: Initialize an integer variable i with the value 5
pid = vfork();: Create a new process. Unlike fork(), vfork() suspends the parent process until the child process exits or calls exec(). 
The child process runs in the same address space as the parent process until it completes
vfork() returns:
0 to the child process.
The child's PID to the parent process.
i = i + 1;: Both the parent and child processes share the same address space. When i is incremented, this change is visible to both processes.
This increment operation changes i to 6
if (pid == 0): The child process executes this block.
printf("Child: %d\n", i);: The child process prints "Child: 6".
_exit(0);: The child process exits, allowing the parent process to resume.
else: The parent process executes this block after the child process exits.
After the child process exits, the parent process resumes.
The parent process prints "Parent: %d\n", i

*/