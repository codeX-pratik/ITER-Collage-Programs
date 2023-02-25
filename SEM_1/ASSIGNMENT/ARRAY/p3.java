/*
Write a java program using an array that reads the integers between 1 and 100 and counts the occurrences of each. Assume the input ends with 0.
 */

package ARRAY;
import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int array[] = new int[size];
        for (int i=0 ; i<size ; i++) {
            int r = (int)(100 * Math.random());
            array[i] = r;
        }
        System.out.println("The Array Randomly Generated");
        for (int i=0 ; i<array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        for (int i=0 ; i<array.length ; i++) {
            int count = 0;
            for (int j=0 ; j<array.length ; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println((i+1) + ". " + array[i] + " occurs " + count + " times");
            } else {
                System.out.println((i+1) + ". " + array[i] + " occurs " + count + " time");
            }
        }

        sc.close();
    }
}
/*
output :

Enter the size of the array : 10 
The Array Randomly Generated
47 85 93 2 47 9 81 90 80 22
1. 47 occurs 2 times
2. 85 occurs 1 time
3. 93 occurs 1 time
4. 2 occurs 1 time
5. 47 occurs 2 times
6. 9 occurs 1 time
7. 81 occurs 1 time
8. 90 occurs 1 time
9. 80 occurs 1 time
10. 22 occurs 1 time
 */
