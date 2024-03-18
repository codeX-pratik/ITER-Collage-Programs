import java.util.Arrays;

public class Lab_work_4 {
    // sum of N number using the Iteration Process
    public static int sumOfN_Number_Iterative(int []arr) {
        int sum = 0;
        for (int i=0 ; i<arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // sum of N number using the Recursion Process
    public static int sumOfN_Number_Recursion(int []arr, int n) {
        if (n == 0) {
            return arr[0];
        }
        return arr[n] + sumOfN_Number_Recursion(arr, n-1);
    }

    // merging 2 sorted array using a new array
    public static int[] mergeSort(int []arr1, int []arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int []arr3 = new int[n1 + n2];
        int i=0, j=0, idx = 0;
        
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr3[idx] = arr1[i++];
            } else {
                arr3[idx] = arr2[j++];
            }
            idx++;
        }

        while (i < n1) {
            arr3[idx++] = arr1[i++];
        }

        while (j < n2) {
            arr3[idx++] = arr2[j++];
        }
        return arr3;
    }

    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5};
        int []arr2 = {0,1,3,8,10};

        System.out.println("Sum of N numbers in Iteration Process : " + sumOfN_Number_Iterative(arr1));
        System.out.println("Sum of N numbers in Recursion Process : " + sumOfN_Number_Recursion(arr1, arr1.length - 1));

        System.out.print("The Merged Array : ");
        System.out.println(Arrays.toString(mergeSort(arr1, arr2)));
    }
}