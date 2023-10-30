import java.util.Scanner;

public class p2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of element for Array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Minimum value is " + minimum(arr, n));
        System.out.println("The Maximum value is " + maximum(arr, n));
    }

    public static int minimum(int arr[] , int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n-1] , minimum(arr, n-1));
    }

    public static int maximum(int arr[] , int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n-1] , maximum(arr, n-1));
    }
}

/*

Example : 
{1 ,9 ,-4 ,7 ,-1 ,5 ,-5}
The Minimum value is -5
The Maximum value is 9

 */