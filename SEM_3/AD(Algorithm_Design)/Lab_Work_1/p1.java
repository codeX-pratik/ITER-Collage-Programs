import java.util.*;
class p1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter the number of element for Array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i=0 ; i<arr.length ; i++) {
            sum += arr[i];
        }

        System.out.println("The sum is " + sum);
    }
}

/*
Example : 
{1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9}
The sum is 45

 */