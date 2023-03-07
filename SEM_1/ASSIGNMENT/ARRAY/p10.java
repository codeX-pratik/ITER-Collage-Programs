/*

Design and develop a menu driven java program for the following array operations. 
a. Create an array of N integers
b. Display the array elements
c. Insert an element at specific position
d. Delete an element at a given position
e. Exit

*/

package ARRAY;
import java.util.*;
public class p10 {
    public static int[] insertArray(int mainArray[] , Scanner sc) {
        int []newArray = new int[mainArray.length + 1];
        System.out.print("Enter the postion of the element : ");
        int location = sc.nextInt();
        System.out.print("Enter your element : ");
        int element = sc.nextInt();
        
        for (int i=0 , j=0; i<newArray.length ; i++ , j++) {
            if (location-1 == i) {
                newArray[i] = element;
                j--;
            } else {
                newArray[i] = mainArray[j];
            }
        }
        mainArray = newArray;
        return mainArray;
    }
    public static int[] deleteArray(int mainArray[] , Scanner sc) {
        int []newArray = new int[mainArray.length - 1];
        System.out.print("Enter the Element you want to delete : ");
        int delete = sc.nextInt();

        for (int i=0 , j=0 ; i<newArray.length ; i++ , j++) {
            if (delete == mainArray[i]) {
                j++;
                newArray[i] = mainArray[j];
            } else {
                newArray[i] = mainArray[j];
            }
        }
        mainArray = newArray;
        return mainArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []mainArray = new int[1];
        
        int choice = 1;
        do{
            System.out.println("***MENU***");
            System.out.println("1. Creating Array");
            System.out.println("2. Displaying Array");
            System.out.println("3. Insert an Element at specific position");
            System.out.println("4. Delete an ELement at given position");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5) : ");
            choice = sc.nextInt();
            switch(choice) {
                case 1 :
                    System.out.print("Enter the size of the Array : ");
                    int size = sc.nextInt();
                    int array[] = new int [size];
                    mainArray = array;
                    System.out.println("Enter the Element to Array : ");
                    for (int i=0 ; i<mainArray.length ; i++) {
                        System.out.print((i+1) + " Element : ");
                        mainArray[i] = sc.nextInt();
                    }
                break;
                case 2 : 
                    System.out.println("----------->  The Array is " + Arrays.toString(mainArray));
                break;
                case 3 :
                    mainArray = insertArray(mainArray, sc);
                    System.out.println("The Element inserted Successfully !");
                break;
                case 4 : 
                    mainArray = deleteArray(mainArray, sc);
                    System.out.println("The Element is Successfully Deleted !");
                break;
                case 5 :
                    System.out.println("Exit...");
                    System.out.println("Thank You !!");
                    break;
                default : System.out.println("Invalid Choice !");
                break;
            }
        } while (choice != 5);
        sc.close();
    }
}
/*
output : 

***MENU***
1. Creating Array
2. Displaying Array
3. Insert an Element at specific position       
4. Delete an ELement at given position
5. Exit
Enter your choice (1-5) : 1
Enter the size of the Array : 5
Enter the Element to Array : 
1 Element : 9
2 Element : 5
3 Element : 7
4 Element : 2
5 Element : 6
***MENU***
1. Creating Array
2. Displaying Array
3. Insert an Element at specific position
4. Delete an ELement at given position
5. Exit
Enter your choice (1-5) : 2
----------->  The Array is [9, 5, 7, 2, 6]
***MENU***
1. Creating Array
2. Displaying Array
3. Insert an Element at specific position
4. Delete an ELement at given position
5. Exit
Enter your choice (1-5) : 4
Enter the Element you want to delete : 2
The Element is Successfully Deleted !
***MENU***
1. Creating Array
2. Displaying Array
3. Insert an Element at specific position       
4. Delete an ELement at given position
5. Exit
Enter your choice (1-5) : 2
----------->  The Array is [9, 5, 7, 6]
***MENU***
1. Creating Array
2. Displaying Array
3. Insert an Element at specific position       
4. Delete an ELement at given position
5. Exit
Enter your choice (1-5) : 3
Enter the postion of the element : 4
Enter your element : 2
The Element inserted Successfully !
***MENU***
1. Creating Array
2. Displaying Array
3. Insert an Element at specific position       
4. Delete an ELement at given position
5. Exit
Enter your choice (1-5) : 2
----------->  The Array is [9, 5, 7, 2, 6]      
***MENU***
1. Creating Array
2. Displaying Array
3. Insert an Element at specific position       
4. Delete an ELement at given position
5. Exit
Enter your choice (1-5) : 5
Exit...
Thank You !!
*/