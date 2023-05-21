public class HW_5 {
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "A (Scorce)", "B (Helper)", "C (Destination)");
    }

    public static void towerOfHanoi(int n , String Scorce , String Helper , String Destination) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + Scorce + " to " + Destination);
            return;
        }
        towerOfHanoi(n - 1, Scorce, Destination, Helper);
        System.out.println("Transfer disk " + n + " from " + Scorce + " to " + Destination);
        towerOfHanoi(n - 1 , Helper, Scorce, Destination);
    }
}

/*

Transfer disk 1 from A (Scorce) to B (Helper)
Transfer disk 2 from A (Scorce) to C (Destination)
Transfer disk 1 from B (Helper) to C (Destination)
Transfer disk 3 from A (Scorce) to B (Helper)
Transfer disk 1 from C (Destination) to A (Scorce)
Transfer disk 2 from C (Destination) to B (Helper)
Transfer disk 1 from A (Scorce) to B (Helper)
Transfer disk 4 from A (Scorce) to C (Destination)
Transfer disk 1 from B (Helper) to C (Destination)
Transfer disk 2 from B (Helper) to A (Scorce)
Transfer disk 1 from C (Destination) to A (Scorce)
Transfer disk 3 from B (Helper) to C (Destination)
Transfer disk 1 from A (Scorce) to B (Helper)
Transfer disk 2 from A (Scorce) to C (Destination)
Transfer disk 1 from B (Helper) to C (Destination)

 */