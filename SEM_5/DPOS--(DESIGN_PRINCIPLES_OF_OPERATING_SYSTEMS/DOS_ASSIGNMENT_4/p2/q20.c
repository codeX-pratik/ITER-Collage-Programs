#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

void fun1(){
    fork();
    fork();
    printf("1\n");
}

int main() {
    fun1();
    printf("1\n");
    return 0;
}

/*
output :
1
1
1
1
1
1
1
1


Each process will execute the printf("1\n") statement. Since there are 4 processes by the end of fun1(), each one will print "1".
Returning to main():
After fun1() finishes, each of the 4 processes will execute the printf("1\n") in main().
Thus, there will be 4 more "1" printed, one by each process.

*/