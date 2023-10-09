import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position for the rotation : ");
        int r = sc.nextInt();

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int newArray[] = rotateArray(arr, r);
        System.out.println(Arrays.toString(newArray));
        sc.close();
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

Enter the position for the rotation : 2
[3, 4, 5, 6, 7, 1, 2]

 */