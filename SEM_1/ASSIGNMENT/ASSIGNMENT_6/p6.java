package ASSIGNMENT_6;
import java.util.*;

public class p6 {
    public static int count (String str , char a) {
        int count = 0;
        for (int i=0 ; i<str.length() ; i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String str = sc.next();
        System.out.print("Enter the charater : ");
        char a = sc.next().charAt(0);

        int count = count(str, a);
        System.out.println("count (\"" + str + "\" , '" + a + "') returns " + count);
        sc.close();
    }
}
