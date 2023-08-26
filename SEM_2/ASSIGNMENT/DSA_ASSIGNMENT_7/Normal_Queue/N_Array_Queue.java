import java.util.Scanner;

public class N_Array_Queue {
    
    public static int front = 0;
    public static int rear = -1;
    public static final int MAX = 10;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int Q[] = new int[MAX];

        while (true) {
            System.out.println("---> MENU <---");
            System.out.println("0. Exit");
            System.out.println("1. EnQueue");
            System.out.println("2. DeQueue");
            System.out.println("3. Display");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            switch(choice) {
                case 0 : System.out.println("Exiting..."); System.exit(0); break;
                case 1 : enQueue(Q); break;
                case 2 : deQueue(Q); break;
                case 3 : display(Q); break;
                default : System.out.println("Invalid choice "); break;
            }
        }
    }

    public static void enQueue(int[]Q){
        if (rear == MAX-1) {
            System.out.println("Queue is Full");
            return;
        }
        System.out.print("Enter the element for Queue : ");
        Q[++rear] = sc.nextInt();
    }

    public static void deQueue(int[]Q) {
        if (rear == -1) {
            System.out.println("Queue is EMpty");
            return;
        }
        for (int i=0 ; i<rear ; i++) {
            Q[i] = Q[i+1];
        }
        rear--;
        System.out.println(Q[0] + " is removed form Queue");
    }

    public static void display(int[]Q) {
        if (rear == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Queue Element are : ");
        System.out.println("---> " + Q[0]);
        for (int i=1 ; i<=rear ; i++) {
            System.out.println("     " + Q[i]);
        }
    }
}
