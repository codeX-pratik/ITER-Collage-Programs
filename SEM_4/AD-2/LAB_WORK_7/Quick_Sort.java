import java.util.Arrays;
public class Quick_Sort {

	int partition(int arr[], int low, int high) {
		int pivot = arr[high]; 
		int i = (low-1);
		for (int j=low; j<high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}

	void sort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}

	static void printArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
	}

	public static void main(String args[]) {
		int arr[] = {10, 7, 8, 9, 1, 5};
        System.out.print("Given Array : ");
        printArray(arr);

		Quick_Sort Q = new Quick_Sort();
		Q.sort(arr, 0, arr.length - 1);

		System.out.print("Sorted array : ");
        printArray(arr);
	}
}

/*

output : 

    Given Array : [10, 7, 8, 9, 1, 5]
    Sorted array : [1, 5, 7, 8, 9, 10]

 */