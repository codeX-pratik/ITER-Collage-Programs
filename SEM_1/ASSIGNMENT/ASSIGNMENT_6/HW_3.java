package ASSIGNMENT_6;
import java.util.*;
public class HW_3 {
    public static char forOddString(String word) {
        char c = word.charAt(word.length() - (word.length()/2)-1);
        return c;
    }
    public static char forEvenString(String word) {
        char c = word.charAt(word.length() - (word.length()/2));
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String word = sc.next();

        if (word.length() % 2 == 0) {
            System.out.println(forEvenString(word));
        } else {
            System.out.println(forOddString(word));
        }
        sc.close();
    }
}
