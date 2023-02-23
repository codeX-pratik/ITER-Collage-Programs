package ASSIGNMENT_4;
import java.util.*;
public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean r = true;

        while (r) {
            System.out.print("User Guess : ");
            int user = sc.nextInt();
            int comp = (int)(10 * Math.random()) + 1;
            System.out.println("Computer Guess : " + comp);

            if (user == comp) {
                System.out.println("Good guess");
                r = false;
                break;
            } else if (user > comp) {
                System.out.println("Too high ; try again");
            } else if (user < comp) {
                System.out.println("Too low , try again");
            }
        }
        sc.close();
        
    }
}