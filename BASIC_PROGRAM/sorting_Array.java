package BASIC_PROGRAM;
import java.util.*;
public class sorting_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        int []sorting_Array = new int[size];
        for (int i=0 ; i<sorting_Array.length ; i++) {
            System.out.print("Enter " + (i+1) + " Element of Array : ");
            sorting_Array[i] = sc.nextInt();
        }
        System.out.println("The Original Array is " + Arrays.toString(sorting_Array));
        for (int i=0 ; i<sorting_Array.length ; i++) {
            for (int j=0 ; j<sorting_Array.length ; j++) {
                if (sorting_Array[j] < sorting_Array[i]) {
                    int temp = sorting_Array[i];
                    sorting_Array[i] = sorting_Array[j];
                    sorting_Array[j] = temp;
                }
            }
        }
        System.out.println("The sorted Array is " + Arrays.toString(sorting_Array));

        sc.close();
    }
}
/*
Enter the size of the Array : 5
Enter 1 Element of Array : 9
Enter 2 Element of Array : 5
Enter 3 Element of Array : 7
Enter 4 Element of Array : 2
Enter 5 Element of Array : 6
The Original Array is [9, 5, 7, 2, 6]
The sorted Array is [9, 7, 6, 5, 2]
*/