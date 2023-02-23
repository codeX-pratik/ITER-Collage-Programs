

public class HW_5 {
    public static void main(String[] args) {
        int W = 10;
        int G = 20;
        int K = 30;
        int A = 40;
        int temp;

        System.out.println("values before swaping :");
        System.out.println("w = " + W);
        System.out.println("G = " + G);
        System.out.println("K = " + K);
        System.out.println("A = " + A);

        temp = W;
        W = A;
        A = K;
        K = G;
        G = temp;

        System.out.println("value after swaping :");
        System.out.println("w = " + W);
        System.out.println("G = " + G);
        System.out.println("K = " + K);
        System.out.println("A = " + A);

    }
}