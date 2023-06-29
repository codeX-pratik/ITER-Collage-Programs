import java.util.*;

public class Queue_Array_Implementation {
    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int queue[] = new int[MAX];

        while (true) {
            System.out.println("---> MENU <---");
            System.out.println("0. Exit");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice){
                case 0 : System.exit(0); break;
                case 1 : intsert(queue); break;
                case 2 : delete(queue); break;
                case 3 : display(queue); break;
                default : System.out.println("Invalid Choice !!"); break;
            }
        }
    }

    public static boolean isEmpty() {
        return (rear == -1);
    }

    public static boolean isFull() {
        return (rear == MAX-1);
    }

    public static int data() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your data : ");
        int d = sc.nextInt();
        return d;
    }

    public static void intsert(int Q[]) {
        if (isFull()) {
            System.out.println("Queue is Full !");
            return;
        }
        rear++;
        Q[rear] = data();
    }

    public static void delete(int Q[]) {
        if (isEmpty()) {
            System.out.println("Queue is Empty !");
        }
        for(int i=0 ; i<rear ; i++) {
            Q[i] = Q[i+1];
        }
        rear--;
        System.out.println(Q[0] + " is removed");
    }

    public static void display(int Q[]) {
        if(isEmpty()) {
            System.out.println("Queue is Empty !");
        } else {
            
            System.out.println(Q[0]);
        }
    }

}