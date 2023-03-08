package BASIC_PROGRAM;
import java.util.*;
public class String_palindrome_check {
    public static boolean reverseCheck(String str) {
        String revcheck = reverseString(str);
        return str.equals(revcheck);
    }
    public static String reverseString(String str) {
        String rev = "";
        for (int i=str.length()-1 ; i>=0 ; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String str = sc.next();

        if (reverseCheck(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
        sc.close();
    }    
}
/*
Enter the word : madam
madam is a palindrome

Enter the word : hello
hello is not a palindrome
*/