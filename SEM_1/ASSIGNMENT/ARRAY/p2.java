/* 
Write a java program to create an array of size N and store the random values between 1 to 100 in it and print the number of prime numbers present in the array.
Sample run:
Enter number of elements 5
Enter Array elements:
11 22 33 39 43
The number of prime numbers are 2.
*/
package ARRAY;
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int []array = new int[size];
        for (int i=0 ; i<size ; i++) {
            int r = (int)(100 * Math.random());
            array[i] = r;
        }
        
        for (int i=0 ; i<array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Array randomly generated");
        int f = 0;
        System.out.println("The prime Number in array are : ");
        
        for (int i=0 ; i<array.length ; i++) {
            int a = array[i];
            for (int j=2 ; j<a ; j++) {
                if (a % j == 0) {
                    f = 0;
                    break;
                } else {
                    f = 1;
                }
            }
            if (f == 1) {
                System.out.print(a + " ");
            }
        }
        sc.close();
    }
}
/*
output :

Enter the size of the array : 5
69 40 51 47 97 Array randomly generated
The prime Number in array are :
47 97
 */