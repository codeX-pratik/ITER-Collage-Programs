public class program7 {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int z;
        System.out.println("Before exchange :-");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        z = x;
        x = y;
        y = z;
        System.out.println("After exchange :-");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}