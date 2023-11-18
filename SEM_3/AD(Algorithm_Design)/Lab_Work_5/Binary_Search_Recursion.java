import java.util.Scanner;

public class Binary_Search_Recursion {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter the element for Array : ");
        for (int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number for searching : ");
        int r = binarySearch_Recursion(arr, 0 , arr.length-1 , sc.nextInt());
        if (r != -1) {
            System.out.println("The searched element is in position : " + r);
        } else {
            System.out.println("The element does not exist.");
        }
    }

    public static int binarySearch_Recursion(int []arr , int l , int r , int x) {
        if (r >= l && l <= arr.length -1) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) 
                return mid;
            if (arr[mid] > x) {
                return binarySearch_Recursion(arr, l, mid-1, x);
            } else {
                return binarySearch_Recursion(arr, mid+1, r, x);
            }
        }
        return -1;
    }
}
