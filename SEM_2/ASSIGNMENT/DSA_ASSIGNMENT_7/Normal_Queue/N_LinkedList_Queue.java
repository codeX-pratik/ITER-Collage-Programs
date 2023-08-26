import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node (int d) {
        data = d;
        next = null;
    }
}

public class N_LinkedList_Queue {

    public static Scanner sc = new Scanner(System.in);
    public static Node front = null , rear = null;
    public static void main(String[] args) {

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
                case 1 : front = enQueue(front, rear); rear = getRear(front); break;
                case 2 : front = deQueue(front, rear); break;
                case 3 : display(front, rear); break;
                default : System.out.println("Invalid choice"); break;
            }
        }
    }

    public static Node getRear(Node front) {
        Node cNode = front;
        while (cNode.next != null) {
            cNode = cNode.next;
        }
        return cNode;
    }
    public static Node enQueue(Node front , Node rear) {
        System.out.print("Enter the element for Queue : ");
        Node newNode = new Node(sc.nextInt());

        if (front == null && rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        return front;
    }

    public static Node deQueue(Node front , Node rear) {
        if (front == null) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println(front.data + " is romoved from the Queue");
            front = front.next;
        }
        return front;
    }

    public static void display(Node front , Node rear) {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("---> " + front.data);
        Node cNode = front.next;
        while (cNode != null) {
            System.out.println("     " + cNode.data);
            cNode = cNode.next;
        }
    }
}