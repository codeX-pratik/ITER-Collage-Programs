import java.util.*;

public class Generic_Array_Queue {

    public static Scanner sc = new Scanner(System.in);
    public static int front = 0;
    public static int rear = -1;
    public static final int MAX = 10;
    public static void main(String[] args) {
        Object Q[] = new Object[MAX];

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

    public static void enQueue(Object[] Q) {
        if (rear == MAX-1) {
            System.out.println("Queue is full");
            return;
        } else {
            System.out.print("Enter the element for Queue : ");
            Q[++rear] = (Object) sc.next();
        }
    }

    public static void deQueue(Object[] Q) {
        if (rear == -1) {
            System.out.println("Queue is Empty");
            return;
        } else {
            for (int i=0 ; i<rear ; i++) {
                Q[i] = Q[i+1];
            }
            rear--;
            System.out.println(Q[0] + " is removed form Queue");
        }
    }

    public static void display(Object[] Q) {
        if (rear == -1) {
            System.out.println("Queue is Empty");
            return;
        } else {
            for (int i=0 ; i<=rear ; i++) {
                System.out.println(Q[i]);
            }
            System.out.println();
        }
    }
}