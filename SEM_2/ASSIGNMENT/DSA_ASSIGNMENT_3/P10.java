import java.util.*;
public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String : ");
        String s = sc.next();
        System.out.print("The Reversed String is ");
        System.out.println(reverseString(s));

        sc.close();
    }

    public static String reverseString(String s) {
        if (s.length() <= 1 || s == null) {
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
}
