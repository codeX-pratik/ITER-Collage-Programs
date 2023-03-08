package BASIC_PROGRAM;
import java.util.*;
public class Insert_Element_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        int []insert = new int[size];
        for (int i=0 ; i<insert.length ; i++) {
            System.out.print("Enter " + (i+1) + " Element of Array : ");
            insert[i] = sc.nextInt();
        }
        System.out.println("The original Array is " + Arrays.toString(insert));
        insert = insertArray(insert, sc);
        System.out.println("The New Array is " + Arrays.toString(insert));

        sc.close();
    }
    public static int[] insertArray(int insert[] , Scanner sc) {
        int []tempArray = new int[insert.length + 1];
        System.out.print("Enter the postion to insert the element : ");
        int postion = sc.nextInt();
        System.out.print("Enter the Element to be Inserted : ");
        int element = sc.nextInt();
        for (int i=0 , j=0 ; i<tempArray.length ; i++ , j++) {
            if (postion - 1 == i) {
                tempArray[i] = element;
                j--;
            } else {
                tempArray[i] = insert[j];
            }
        }
        insert = tempArray;
        return insert;
    }
}
/*
Enter the size of the Array : 5
Enter 1 Element of Array : 9
Enter 2 Element of Array : 5
Enter 3 Element of Array : 7
Enter 4 Element of Array : 2
Enter 5 Element of Array : 6
The original Array is [9, 5, 7, 2, 6]
Enter the postion to insert the element : 4      
Enter the Element to be Inserted : 25
The New Array is [9, 5, 7, 25, 2, 6]
*/