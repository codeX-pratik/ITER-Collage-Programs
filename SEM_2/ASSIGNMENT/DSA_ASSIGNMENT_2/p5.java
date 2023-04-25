package DSA_ASSIGNMENT_2;
import java.util.*;
class Deposit {
    long principle;
    int time;
    double rate;
    double total_amt;
    Deposit() {
        principle = 0;
        time = 0;
        rate = 0;
    }
    Deposit (long p , int t , double r) {
        principle = p;
        time = t;
        rate = r;
        calc_amt();
    }
    Deposit (long p , int t) {
        principle = p;
        time = t;
        rate = 0.0;
        calc_amt();
    }
    Deposit (long p , double r) {
        principle = p;
        time = 1;
        rate = r;
        calc_amt();
    }
    void display() {
        System.out.println("----> DISPLAY PART <----");
        System.out.println("Principle : " + principle);
        System.out.println("Time : " + time);
        System.out.println("Rate : " + rate);
        System.out.println("----> Total Amount is " + total_amt);
    }
    void calc_amt() {
        total_amt = principle + ((principle * rate * time)/100);
    }
}
public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Deposits : ");
        int d = sc.nextInt();
        Deposit []dep = new Deposit[d];
        for (int i=0 ; i<d ; i++) {
            System.out.print("Enter the Princeple : ");
            long p = sc.nextLong();
            System.out.print("Enter the Time : ");
            int t = sc.nextInt();
            System.out.print("Enter the Rate : ");
            double r = sc.nextDouble();

            dep[i] = new Deposit(p, t, r);
            dep[i].display();
        }
        sc.close();
    }
}