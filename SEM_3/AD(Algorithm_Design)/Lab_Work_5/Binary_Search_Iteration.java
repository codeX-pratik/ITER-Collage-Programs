import java.util.Scanner;

public class Binary_Search_Iteration {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter the element for Array : ");
        for (int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number for searching : ");
        int r = binarySearch_Iteration(arr, arr.length, sc.nextInt());
        if (r != -1) {
            System.out.println("The searched element is in position : " + r);
        } else {
            System.out.println("The element does not exist.");
        }
    }

    public static int binarySearch_Iteration(int []arr , int n , int x) {
        int l=0 , r = n-1;
        while (l<=r) {
            int mid = l + (r - 1) / 2;
            if (arr[mid] == x)
                return x;
            if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
