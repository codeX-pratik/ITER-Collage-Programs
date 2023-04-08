package ASSIGNMENT_1;
import java.util.*;
public class p9 {
    public static double sumMajorDiagonal(double [][]m) {
        int r = m.length;
        int c = m[0].length;
        double sum = 0;
        for (int i=0 ; i<r ; i++) {
            for (int j=0 ; j<c ; j++) {
                if (i == j) {
                    sum += m[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row and Column of 2D-Array : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        double arr[][] = new double[r][c];
        System.out.print("Enter the matric row by row : ");
        for (int i=0 ; i<r ; i++) {
            for (int j=0 ; j<c ; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        for (int i=0 ; i<r ; i++) {
            for (int j=0 ; j<c ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of the elemet in the major diagonal is " + sumMajorDiagonal(arr));
        sc.close();
    }
}
