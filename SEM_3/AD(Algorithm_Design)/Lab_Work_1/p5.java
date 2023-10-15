import java.util.Scanner;

public class p5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter the number of element for Array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        boolean missing;  
        for (int i = 1;; i++) {
            missing = false;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    missing = true;
                    break;
                }    
            }
            if (missing == false) {
                System.out.println("Missing smallest positive number is "+i);  
                break;
            }
        }
    }
}

/*

{-2, -3, 4, -1, -2, 1, 5, -3}

 */


