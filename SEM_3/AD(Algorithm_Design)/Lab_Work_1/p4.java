import java.util.Scanner;
public class p4 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of element for Array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        
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

Example : 
{-2, -3, 4, -1, -2, 1, 5, -3}
The max value is 7

 */