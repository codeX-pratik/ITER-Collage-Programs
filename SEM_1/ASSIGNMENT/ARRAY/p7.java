/*
Write a method to find the second largest element present in the Array. The method header is
given below.
public static int sec_max(int[] array)
Write a java program that prompts the user to enter 5 numbers, invokes this method to return
the maximum value, and displays the maximum value. Here is a sample run of the program
 */

package ARRAY;
import java.util.*;
public class p7 {
    public static int sec_max(int []array) {
        for (int i=0 ; i<array.length ; i++) {
            for (int j=0 ; j<array.length ; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int array[] = new int[size];
        for (int i=0 ; i<size ; i++) {
            System.out.print("Enter the " + i + "th value of array : ");
            array[i] = sc.nextInt();
        }
        System.out.println("The second maximum Number is " + sec_max(array));
        sc.close();
    }
}
/*
output: 

Enter the size of the array : 5
Enter the 0th value of array : 9
Enter the 1th value of array : 5
Enter the 2th value of array : 7
Enter the 3th value of array : 2
Enter the 4th value of array : 3
The second maximum Number is 7
 */