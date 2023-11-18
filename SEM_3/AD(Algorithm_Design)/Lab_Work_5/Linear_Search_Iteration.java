import java.util.Scanner;

public class Linear_Search_Iteration {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter the element for Array : ");
        for (int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number for searching : ");
        int r = linearSearch_Iteration(arr, arr.length, sc.nextInt());
        if (r != -1) {
            System.out.println("The searched element is in position : " + r);
        } else {
            System.out.println("The element does not exist.");
        }
    }

    public static int linearSearch_Iteration(int arr[] ,int n , int x) {
        for (int i=0 ; i<n ; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
