import pkg1.*;
import pkg2.*;

public class p10 implements Sports{
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.input_s();
        t.input_m();

        t.output_s();
        t.output_m();

        double grandTotal = t.getMark1() + t.getMark2() + score1 + score2;
        System.out.println("Grand Total is : " + grandTotal);
    }
}
