package ASSIGNMENT_6;
import java.util.*;
public class p7 {
    public static int count(String  str) {
        int count = 0;
        for (int i=0 ; i<str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'B' || ch == 'I' || ch == 'O' || ch == 'U') {
                    count++;
                }  
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in);
        System.out.print("Enter the word : ");
        String str = sc.next();

        int count = count(str);
        System.out.println("count (\"" + str + "\") returns " + count);
        sc.close();
    }
}
