/*

Write a java program that implements the array reversal algorithm suggested in Note 1.
Note 1: There is a simpler algorithm for array reversal that starts out with two indices, i=0 
and j=n-1. With each iteration i is increased and j is decreased for i<j.

*/


package ARRAY;
import java.util.*;
public class p8 {
    public static void reverseArray(int rev[]) {
        int i=0;
        int j=rev.length - 1;
        while (i < j) {
            int temp = rev[i];
            rev[i] = rev[j];
            rev[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int []rev = new int[size];
        for (int i=0 ; i<size ; i++) {
            rev[i] = sc.nextInt();
        }
        reverseArray(rev);
        System.out.println("Reverse Array is " + Arrays.toString(rev));
        sc.close();
    }
}

/*
output :

Enter the size of the array : 5
9 5 7 2 6
Reverse Array is [6, 2, 7, 5, 9]

*/