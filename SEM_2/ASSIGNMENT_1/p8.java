package ASSIGNMENT_1;
import java.util.*;
public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Row and Columns of 2D-Array : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("Enter element of 2D-Array : ");
        int arr[][] = new int[r][c];
        for (int i=0 ; i<r ; i++) {
            for (int j=0 ; j<c ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0 ; i<r ; i++) {
            for (int j=0 ;j<c ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i=0 ; i<r ; i++) {
            for (int j=0 ;j<c ; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of element of the 2D-Array is " + sum);
        sc.close();
    }
}
