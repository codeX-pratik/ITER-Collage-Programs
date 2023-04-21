package DSA_ASSIGNMENT_2;
import java.util.*;

class Phone {
    int area_code , exchange , number;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area code : ");
        area_code = sc.nextInt();
        System.out.print("Enter the exchange : ");
        exchange = sc.nextInt();
        System.out.print("Enter the Number : ");
        number = sc.nextInt();
        sc.close();
    }
    void display() {
        System.out.println("(" + area_code + ") "  + exchange + "-" + number);
    }
}

public class p1 {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        obj1.input();
        System.out.print("My Number is ");
        obj1.display();
    }
}
