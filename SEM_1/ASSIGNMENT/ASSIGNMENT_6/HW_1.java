package ASSIGNMENT_6;
import java.util.*;
public class HW_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();

        for (int i=0 ; i<str.length() ; i++) {
            boolean unique_char = true;
            for (int j=0 ; j<str.length() ; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique_char = false;
                }
            }
            if (unique_char) {
                System.out.println(str.charAt(i));
                break;
            }
        }
        sc.close();
    }
}
