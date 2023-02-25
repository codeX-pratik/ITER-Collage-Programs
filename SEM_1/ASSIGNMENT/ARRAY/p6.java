/*
Write a method to find the second smallest element present in the Array. The method header
is given below.
public static double sec_small(double[] array)
Write a java program that prompts the user to enter ten numbers, invokes this method to return
the second minimum value, and displays the second minimum value. Here is a sample run of the
program:
 */
package ARRAY;
import java.util.*;
public class p6 {
    public static double sec_small(double []array) {
        for (int i=0 ; i<array.length ; i++) {
            for (int j=0 ; j<array.length ; j++) {
                if (array[j] < array[i]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[(array.length) - 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        double []array = new double[size];
        for (int i=0 ; i<size ; i++) {
            System.out.print("Enter the " + i + "th value of array : ");
            array[i] = sc.nextDouble();
        }
        System.out.println("The second minimum Number is " + sec_small(array));
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
The second Number of array is 1.9
 */
