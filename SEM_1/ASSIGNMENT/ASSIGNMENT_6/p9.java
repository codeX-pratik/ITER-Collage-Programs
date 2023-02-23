package ASSIGNMENT_6;
import java.util.*;
public class p9 {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        int count = 0;
        for (int i=0 ; i< password.length() ; i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count >= 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password : ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        sc.close();
    }
}
