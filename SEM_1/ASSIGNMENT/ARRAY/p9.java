/*

Write a method to find the element present in the Array using Linear Search. The method header is given below.
public static int Lsearch(int[] array, item)
The method will return the index of the item if the element is present in the array. Otherwise it will return -1. 
Write a java program that prompts the user to enter 5 numbers, and the item to search, then invokes 
this method to display whether the element is present in the array. Here is a sample run of the program:

 */

package ARRAY;
import java.util.*;
public class p9 {
    public static int Lsearch(int []array , int item) {
        int location = 0;
        for (int i=0 ; i<array.length ; i++) {
            if (item == array[i]) {
                location = i;
            }
        }
        return location + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();

        System.out.print("Enter the Number you want to search : ");
        int x = sc.nextInt();

        int array[] = new int[size];
        for(int i=0 ; i<size ; i++) {
            System.out.print("Enter the " + i + "th value of array : ");
            array[i] = sc.nextInt();
        }
        System.out.println("The Element is present in the array at position :" + Lsearch(array, x));
        sc.close();
    }
}

/*
output :

Enter the size of the Array : 5
Enter the Number you want to search : 7
Enter the 0th value of array : 9
Enter the 1th value of array : 5
Enter the 2th value of array : 7
Enter the 3th value of array : 2
Enter the 4th value of array : 6
The Element is present in the array at position :3
 */