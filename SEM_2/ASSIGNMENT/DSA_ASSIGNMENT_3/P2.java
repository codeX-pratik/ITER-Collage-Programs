import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String color[] = new String[4];
        System.out.println("Enter four colour : ");
        for (int i=0 ;i<color.length ; i++) {
            color[i] = sc.next();
        }
        try {
            for (int i=0 ; i<color.length ; i++) {
                System.out.println(Integer.parseInt(color[i]));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.print("Enter one more colour : ");
            color[5] = sc.next();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("The colours entered are : ");
        for (int i=0 ; i<color.length ; i++) {
            System.out.println(color[i]);
        }
    }
}


/*

Enter four colour : 
RED BLUE
YELLOW
GREEN
java.lang.NumberFormatException: For input string: "RED"
Enter one more colour : VIOLET
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4 
The colours entered are :
RED
BLUE
YELLOW
GREEN

 */