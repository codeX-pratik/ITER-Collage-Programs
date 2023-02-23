

public class HW_5_1 {
    public static void main(String[] args) {
        int W = 10;
        int A = 20;
        int K = 30;
        int G = 40;

        System.out.println("values before swaping :");
        System.out.println("w = " + W);
        System.out.println("A = " + A);
        System.out.println("K = " + K);
        System.out.println("G = " + G);

        //without using temp variable
        W = W + A;
        A = W - A;
        W = W - A;

        A = A + K;
        K = A - K;
        A = A - K;

        K = K + G;
        G = K - G;
        K = K - G;

        

        System.out.println("values after swaping :");
        System.out.println("w = " + W);
        System.out.println("A = " + A);
        System.out.println("K = " + K);
        System.out.println("G = " + G);
    }
}
