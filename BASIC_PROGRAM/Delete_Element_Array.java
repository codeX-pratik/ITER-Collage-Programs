package BASIC_PROGRAM;
import java.util.*;
public class Delete_Element_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        int []delete = new int[size];
        for (int i=0 ; i<delete.length ; i++) {
            System.out.print("Enter " + (i+1) + " Element of Array : ");
            delete[i] = sc.nextInt();
        }
        System.out.println("The Original Array is " + Arrays.toString(delete));
        delete = deleteArray(delete, sc);
        System.out.println("The New Array is " + Arrays.toString(delete));

        sc.close();
    }
    public static int[] deleteArray(int delete[] , Scanner sc) {
        int []tempArray = new int[delete.length - 1];
        System.out.print("Enter the Element you want to Delete : ");
        int del = sc.nextInt();
        for (int i=0 , j=0 ; i<tempArray.length ; i++ , j++) {
            if (del == delete[i]) {
                j++;
                tempArray[i] = delete[j];
            } else {
                tempArray[i] = delete[j];
            }
        }
        delete = tempArray;
        return delete;
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
Enter the Element you want to Delete : 7
The New Array is [9, 5, 2, 6]
*/