import java.util.*;

public class HW_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String : ");
        String s = sc.next();

        if (isPalindrome(s)) {
            System.out.println(" Yes , this is a palindrome.");
        } else {
            System.out.println("No , this is not a palindrome.");
        }
        sc.close();
    }

    public static boolean isPalindrome(String s) {

        // for checking the inputted string is valid or not
        if (s.length() <= 1) {
            return true;
        }

        //for checking the first and last elements of the string
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}
