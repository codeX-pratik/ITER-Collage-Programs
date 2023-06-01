public class HW_5 {
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "A (Source)", "B (Helper)", "C (Destination)");
    }

    public static void towerOfHanoi(int n , String Source , String Helper , String Destination) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + Source + " to " + Destination);
            return;
        }
        towerOfHanoi(n - 1, Source, Destination, Helper);
        System.out.println("Transfer disk " + n + " from " + Source + " to " + Destination);
        towerOfHanoi(n - 1 , Helper, Source, Destination);
    }
}

/*

Transfer disk 1 from A (Source) to B (Helper)
Transfer disk 2 from A (Source) to C (Destination)
Transfer disk 1 from B (Helper) to C (Destination)
Transfer disk 3 from A (Source) to B (Helper)
Transfer disk 1 from C (Destination) to A (Source)
Transfer disk 2 from C (Destination) to B (Helper)
Transfer disk 1 from A (Source) to B (Helper)
Transfer disk 4 from A (Source) to C (Destination)
Transfer disk 1 from B (Helper) to C (Destination)
Transfer disk 2 from B (Helper) to A (Source)
Transfer disk 1 from C (Destination) to A (Source)
Transfer disk 3 from B (Helper) to C (Destination)
Transfer disk 1 from A (Source) to B (Helper)
Transfer disk 2 from A (Source) to C (Destination)
Transfer disk 1 from B (Helper) to C (Destination)

 */