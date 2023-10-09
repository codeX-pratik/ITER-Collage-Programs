public class p2 {
    public static void main(String[] args) {
        int arr[] = {1 ,9 ,-4 ,7 ,-1 ,5 ,-5};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0 ; i<arr.length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The max value is " + max);
        System.out.println("The min value is " + min);
    }
}

/*

The max value is 9
The min value is -5

 */