import java.util.*;
public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of lines to be inputed : ");
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        for(int i=0 ; i<n ; i++) {
            System.out.print("Enter you first line : ");
            System.out.print(i + ". ");
            arr[i] = sc.nextLine();
        }
        for (int i=arr.length-1 ; i>=0 ; i--) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}