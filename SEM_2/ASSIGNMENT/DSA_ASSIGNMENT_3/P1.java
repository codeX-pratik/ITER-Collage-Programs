import java.util.*;
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lucky Number : ");
        int luckyNumber = sc.nextInt();
        try {
            if (luckyNumber < 0) {
                throw new NumberFormatException();
            }
            System.out.println("Your lucky Number is " + luckyNumber);
        } catch (Exception e) {
            System.out.println(e + " : Negativa Number");
        }
        
    }
}

/*

Enter your lucky Number : -90
java.lang.NumberFormatException : Negativa Number

Enter your lucky Number : 34
Your lucky Number is 34

 */