public class p1 {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int c = 0;
        while (n >= 2) {
            if (n >= 2) {
                c++;
            }
            n = n / 2;
        }
        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is " + c);
    }
}