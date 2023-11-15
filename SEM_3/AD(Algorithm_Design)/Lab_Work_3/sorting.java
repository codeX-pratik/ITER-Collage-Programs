import java.util.*;

public class sorting {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of Array : ");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter the element for arr : ");
        for (int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("1. Bubble Sort\n2. Seletion Sort\n3. Insertion Sort");
        System.out.print("Enter the sort number you want to use : ");
        switch (sc.nextInt()) {
            case 1 : bubbleSort(arr); break;
            case 2 : selectionSort(arr); break;
            case 3 : insertionSort(arr); break;
            default : System.out.println("Invalid choice");
        }
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i=0 ; i<n-1 ; i++) {
            for (int j=0 ; j<n-i-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Using Bubble sorting : " + Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i=0 ; i<n-1 ; i++) {
            int min = i;
            for (int j=i+1 ; j<n ; j++) {
                min = arr[min] > arr[j] ? j : min;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Using seletion sorting : " + Arrays.toString(arr));
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i=1 ; i<n ; i++) {
            int c = arr[i];
            int j = i-1;
            while (j>=0 && c < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = c;
        }
        System.out.println("Using Insertion sorting : " + Arrays.toString(arr));
    }
}
