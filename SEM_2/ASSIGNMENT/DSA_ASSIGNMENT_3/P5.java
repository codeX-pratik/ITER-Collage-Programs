import java.util.Scanner;

public class P5 {

    public static <T> int count(T[]array , T item) {
        int c = 0;
        for (int i=0 ; i<array.length ; i++) {
            if (item == array[i]) {
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        Integer E[] = new Integer[size];
        System.out.println("Enter Array Element : ");
        for (int i=0 ; i<size ; i++) {
            E[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search : ");
        int item = sc.nextInt();

        System.out.println("Number of times " + item + " present in the array is " + (count(E, item)));
    }
}

/*

Enter the size of the array : 5
Enter Array Element : 
1
2
3
4
5
Enter the element to search : 4
Number of times 4 present in the array is 1

 */