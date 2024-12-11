#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
    int i=5;
    fork();
    i=i+1;
    fork();
    printf ( "% d",i);
    return 0;
}

/*

output : 6666

Main Function Initialization:
int i = 5;: Initialize an integer variable i with the value 5.

First fork() Call:
fork();: This system call creates a new process (child process).
After the first fork(), there are now two processes: the parent and the child.
Incrementing i:
i = i + 1;: Both the parent and the child processes increment the value of i by 1, so i becomes 6 in both processes.

Second fork() Call:
fork();: This second call to fork() creates two more processes from each of the existing processes.
After the second fork(), there are a total of four processes:
Original parent process.
First child process.
Second child process (created from the original parent process).
Third child process (created from the first child process).
Printing i:
printf("%d", i);: All four processes execute this line and print the value of i.

*/