package ASSIGNMENT_6;
import java.util.*;
public class HW_4 {
    public static int wordCount(String str) {
        String [] words = str.split(" ");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the line : ");
        String str = sc.nextLine();

        System.out.println("Number of word in the give line is " + wordCount(str));
        sc.close();
    }
}
