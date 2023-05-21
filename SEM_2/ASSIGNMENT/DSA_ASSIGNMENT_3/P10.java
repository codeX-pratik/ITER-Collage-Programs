import java.util.*;
public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String : ");
        String s = sc.next();
        System.out.print("The Reversed String is ");
        reverseString(s , s.length() - 1);

        sc.close();
    }

    public static void reverseString(String str , int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str, index - 1);
    }
}

/*

Enter your String : pots&pans
The Reversed String is snap&stop

 */