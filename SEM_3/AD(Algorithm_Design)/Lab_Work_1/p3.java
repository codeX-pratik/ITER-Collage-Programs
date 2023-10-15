import java.util.*;
public class p3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of element for Array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the position for the rotation : ");
        int r = sc.nextInt();
        int newArray[] = rotateArray(arr, r);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] rotateArray(int arr[] , int r) {
        int temp[] = new int[arr.length];
        int count = 0;
        for (int i=r ; i<temp.length ; i++) {
            temp[count++] = arr[i];
        }
        for(int i=0 ; i<r ; i++) {
            temp[count++] = arr[i];
        }
        return temp;
    }
}

/*

Example : 
{1, 2, 3, 4, 5, 6, 7}
Enter the position for the rotation : 2
[3, 4, 5, 6, 7, 1, 2]

 */