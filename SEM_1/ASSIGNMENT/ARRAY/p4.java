/*
Write a method to find the smallest element present in the Array. The method header is given below.
public static double min(double[] array)
Write a java program that prompts the user to enter ten numbers, invokes this method to return
the minimum value, and displays the minimum value. Here is a sample run of the program:
 */
package ARRAY;
import java.util.*;
public class p4 {
    public static double min(double []array) {
        double min = array[0];
        for (int i=1 ; i<array.length ; i++) {
            if (!(min < array[i])) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        double array[] = new double[size];
        for (int i=0 ; i<size ; i++) {
            System.out.print("Enter the " + i + "th value of array : ");
            array[i] = sc.nextDouble();
        }

        System.out.println("The min Number is " + min(array));
        sc.close();
    }
}
/*
output :

Enter the size of the array : 10
Enter the 0th value of array : 1.9
Enter the 1th value of array : 2.5
Enter the 2th value of array : 3.7
Enter the 3th value of array : 2
Enter the 4th value of array : 1.5
Enter the 5th value of array : 6
Enter the 6th value of array : 3
Enter the 7th value of array : 4
Enter the 8th value of array : 5
Enter the 9th value of array : 2
The min Number is 1.5
 */