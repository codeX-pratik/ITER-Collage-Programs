import java.util.Scanner;

public class P4 {
    public static < E > void printArray(E[] intputArray) {
        for (int i=0 ; i<intputArray.length ; i++) {
            System.out.print(intputArray[i] + "  ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();

        Integer IntegerArray[] = new Integer[size];
        Double DoubleArray[] = new Double[size];

        //Integer
        System.out.println("Enter Array Elements");
        for (int i=0 ; i<size ; i++) {
            IntegerArray[i] = sc.nextInt();
        }
        System.out.println("Integer Array Contains :");
        printArray(IntegerArray);
        System.out.println();

        //Double
        System.out.println("Enter Array Element");
        for(int i=0 ; i<size ; i++) {
            DoubleArray[i] = sc.nextDouble();
        }
        System.out.println("Double Array contains :");
        printArray(DoubleArray);
    }
}

/*

Enter the size of the Array : 5
Enter Array Elements
1
2
3
4
5
Integer Array Contains :
1  2  3  4  5  
Enter Array Element
1.2
2.3
3.4
4.5
5.6
Double Array contains :
1.2  2.3  3.4  4.5  5.6

 */