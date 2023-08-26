import java.util.*;

class Node<T>{
    T data;
    Node<T> next;
    Node (T e) {
        data = e;
        next = null;
    }
}

public class Generic_LinkedList_Queue {

    public static Scanner sc = new Scanner(System.in);
    public static Node<Object> front = null , rear = null;
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

    public static <T> Node<T> getRear(Node<T> front) {
        Node<T> cNode = front;
        while (cNode.next != null) {
            cNode = cNode.next;
        }
        return cNode;
    }

    public static <T> Node<T> enQueue(Node<T> front , Node<T> rear) {
        System.out.print("Enter the element for Queue : ");
        T e = (T) sc.next();
        Node<T> newNode = new Node<T>(e);
        if (front == null && rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        return front;
    }

    public static <T> Node<T> deQueue(Node<T>front , Node<T> rear) {
        if (front == null) {
            System.out.println("Queue is Empty");
            return front;
        } else {
            System.out.println(front.data + " is removed from the Queue");
            front = front.next;
        }
        return front;
    }

    public static <T> void display(Node<T>front , Node<T>rear) {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("---> " + front.data);
        Node<T> cNode = front.next;
        while (cNode != null) {
            System.out.println("     " + cNode.data);
            cNode = cNode.next;
        }
    }
}
