package DSA_ASSIGNMENT_2;
import java.util.Scanner;
class Complex {
    double real , imag;
    void setdata(double real , double imag) {
        this.real = real;
        this.imag = imag;
    }
    void display () {
        System.out.printf("%.2f + %.2fi\n",this.real, this.imag);
    }
    public static Complex add(Complex c1, Complex c2) {
        Complex result = new Complex();
        result.real = c1.real + c2.real;
        result.imag = c1.imag + c2.imag;
        return result;
    }
}
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex();
        System.out.print("Enter 2 Numbers : ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        c1.setdata(n1, n2);
        System.out.print("c1 = ");
        c1.display();

        Complex c2 = new Complex();
        System.out.print("Enter 2 Number : ");
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        c2.setdata(n3, n4);
        System.out.print("c2 = ");
        c2.display();

        Complex sum = Complex.add(c1,c2);
        System.out.print("sum = ");
        sum.display();

        sc.close();
    }
}
