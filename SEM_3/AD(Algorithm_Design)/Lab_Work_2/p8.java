public class p8 {
    public static void main(String[] args) {
        int arr[] = {1 ,9 ,-4 ,7 ,-1 ,5 ,-5};
        System.out.println("The smallest missing number is " + smallestPositive(arr));
    }

    public static int smallestPositive(int[]arr) {
        int n = arr.length;
        int N = 100;
        boolean[] present = new boolean[N];
        int max_element = Integer.MIN_VALUE;
        for (int i=0; i<n ; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                present[arr[i]] = true;
            }
            max_element = Math.max(max_element,arr[i]);
        }
        for (int i=1 ; i<N ; i++) {
            if (!present[i])
                return i;
        }
        return max_element + 1;
    }
}
/*

Example : 
{1 ,9 ,-4 ,7 ,-1 ,5 ,-5}
The smallest missing number is 2

 */