// question : Write a java program to create an array of size N and store the random values between 1 to N in it and find the sum and average.
package ARRAY;
import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int []array = new int[size];
        for (int i=0 ; i<size ; i++) {
            int r = (int)(size * Math.random()) + 1;
            array[i] = r;
        }
        
        double sum = 0;
        for (int i=0 ; i<array.length ; i++) {
            sum = sum + array[i];
        }
        double avg = sum / size;
        System.out.println("The sum is " + sum);
        System.out.println("The Average is " + avg);
        sc.close();
    }
}

/*
Enter the size of the array : 5
The sum is 21.0
The Average is 4.2 
*/