import java.util.*;
public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size fo the Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the number of elements in Ascending Order : ");
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search : ");
        int search = sc.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int key = binarySearchRecursion(arr, search, start, end);
        if (key == -1) {
            System.out.println("The " + search + " is not present in the array");
        } else {
            System.out.println("The " + search + " is present at index " + (key));  
        }
        sc.close();
    }

    public static int binarySearchRecursion(int[] arr , int key , int start , int end) {
        if (start > end) {
            return -1;
        } else {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                return binarySearchRecursion(arr, key, start, mid - 1);
            } else {
                return binarySearchRecursion(arr, key, mid + 1, end);
            }
        }
    }
}

/*

Enter the size fo the Array : 5
Enter the number of elements in Ascending Order :
11
22
33
44
55
Enter the element to search : 33
The 33 is present at index 2


Enter the size fo the Array : 5
Enter the number of elements in Ascending Order : 
11
22
33
44
55
Enter the element to search : 66
The 66 is not present in the array

 */