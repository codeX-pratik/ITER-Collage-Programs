package BASIC_PROGRAM;
import java.util.*;
public class reversal_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        int []reversal = new int[size];
        for (int i=0 ; i<reversal.length ; i++) {
            System.out.print("Enter " + (i+1) + " Element of Array : ");
            reversal[i] = sc.nextInt();
        }
        System.out.println("The Original Array is " + Arrays.toString(reversal));
        int i = 0;
        int j = reversal.length - 1;
        while (i < j) {
            int temp = reversal[i];
            reversal[i] = reversal[j];
            reversal[j] = temp;
            i++;
            j--;
        }
        System.out.println("The reversed Array is " + Arrays.toString(reversal));

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
The reversed Array is [6, 2, 7, 5, 9]
*/