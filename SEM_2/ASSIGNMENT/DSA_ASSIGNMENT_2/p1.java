import java.util.Scanner;
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
        Phone obj2 = new Phone();

        obj1.area_code = 222;
        obj1.exchange = 212;
        obj1.exchange = 767;
        obj1.number = 8900;
        System.out.print("My number is ");
        obj1.display();


        obj2.input();
        System.out.print("Your Number is ");
        obj2.display();
    }
}