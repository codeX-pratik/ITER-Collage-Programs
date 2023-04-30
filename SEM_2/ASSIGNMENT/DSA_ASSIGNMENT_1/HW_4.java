import java.util.*;
public class HW_4 {
    public static double[][] addMatrix(double [][]a , double[][]b) {
        double result[][] = new double[a.length][a[0].length];
        for (int i=0 ; i<a.length ; i++) {
            for (int j=0 ; j<a[0].length ; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row and Column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        double a[][] = new double[r][c];
        double b[][] = new double[r][c];
        System.out.println("Enter the element for 'a' 2D-Array : ");
        for (int i=0 ; i<r ; i++) {
            for (int j=0 ; j<c ; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Enter the element for 'b' 2D-Array : ");
        for (int i=0 ; i<r ; i++) {
            for (int j=0 ; j<c ; j++) {
                b[i][j] = sc.nextDouble();
            }
        }
        double[][] arr = addMatrix(a, b);
        System.out.println("The Sum of the Two Matrix is ");
        for (int i=0 ; i<arr.length ; i++) {
            for (int j=0 ; j<arr[0].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}