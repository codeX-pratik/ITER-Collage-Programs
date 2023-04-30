import java.util.*;
public class p10 {
    public static double sumColumn(double[][]m , int columnIndex) {
        int r = m.length;
        double sum = 0;
        for (int i=0 ; i<r ; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row and Column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        double [][]arr = new double[r][c];
        System.out.print("Enter the Array row by row : ");
        for (int i=0 ; i<r ; i++) {
            for (int j=0 ;j<c ; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        for (int i=0 ; i<r ; i++) {
            for (int j=0 ; j<c ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i=0 ; i<c ; i++) {
            System.out.println("Sum of the element at Column " + i + " is " + sumColumn(arr, i));
        }
        sc.close();
    }
}