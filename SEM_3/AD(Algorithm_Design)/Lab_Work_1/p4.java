public class p4 {
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSoFar = Integer.MIN_VALUE;
        int maxEnd = 0;
        for (int i=0 ; i<arr.length ; i++) {
            maxEnd += arr[i];
            if (maxSoFar < maxEnd) {
                maxSoFar = maxEnd;
            }
            if (maxEnd < 0) {
                maxEnd = 0;
            }
        }
        System.out.println("The max value is " + maxSoFar);
    }
}

/*

The max value is 7

 */