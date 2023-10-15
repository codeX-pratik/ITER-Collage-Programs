import java.util.*;
public class p6 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of element for Array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int []Max_Min = maxMinArray(selectionSorting(arr));
        System.out.println("The Maximum and Minimum Array is " + Arrays.toString(Max_Min));
    }

    public static int[] maxMinArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int index = 0;
        while (left <= right) {
            if (left != right) {
                result[index++] = arr[right];
                result[index++] = arr[left];
            } else {
                result[index] = arr[left];
            }
            left++;
            right--;
        }
        return result;
    }

    public static int[] selectionSorting(int Array[]) {
        int n = Array.length;
        for (int i=0 ; i<n-1 ; i++) {
            int min = i;
            for (int j=i+1 ; j<n ; j++) {
                if (Array[min] > Array[j]) {
                    min = j;
                }
            }
            int temp = Array[min];
            Array[min] = Array[i];
            Array[i] = temp;
        }
        return Array;
    }
}

/*

Example : 
{1 ,2 ,3 ,4 ,5, 6}
The Maximum and Minimum Array is [6, 1, 5, 2, 4, 3]

 */

