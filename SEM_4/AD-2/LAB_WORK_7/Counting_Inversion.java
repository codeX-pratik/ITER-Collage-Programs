public class Counting_Inversion {
 
    static int getInvCount(int arr[], int n) {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println("Number of inversions are : " + getInvCount(arr, arr.length));
    }
}

/*

output : 

    Number of inversions are : 5

 */