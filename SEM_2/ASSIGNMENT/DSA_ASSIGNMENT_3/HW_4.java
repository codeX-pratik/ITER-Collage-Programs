public class HW_4 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 10, 1, 6};
        int k = 5;
        
        System.out.println("Before rearranging: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        rearrangeArray(arr, k);
        System.out.println("\nAfter rearranging: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rearrangeArray(int[] arr, int k) {
        rearrangeArrayHelper(arr, k, 0, arr.length - 1);
    }

    private static void rearrangeArrayHelper(int[] arr, int k, int start, int end) {
        if (start >= end) {
            return;
        }
        
        if (arr[start] > k && arr[end] <= k) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        
        if (arr[start] <= k) {
            rearrangeArrayHelper(arr, k, start + 1, end);
        }
        
        if (arr[end] > k) {
            rearrangeArrayHelper(arr, k, start, end - 1);
        }
    }
}
