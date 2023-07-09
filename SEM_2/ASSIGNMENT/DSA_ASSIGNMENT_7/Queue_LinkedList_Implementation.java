import java.util.*;

class Node {
    int info;
    Node next;

    Node (int i) {
        this.info = i;
        this.next = null;
    }
}
public class Queue_LinkedList_Implementation {

    public static Scanner sc = new Scanner(System.in);
    public static Node front = null , rear = null;
    public static void main(String[] args) {

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
                case 1 : front = insert(front, rear);
                         rear = Rear(front); 
                        break;
                case 2 : front = delete(front, rear); break;
                case 3 : display(front, rear); break;
                default : System.out.println("Invalid Choice !!"); break;
            }
        }
    }

    public static Node insert(Node front , Node rear) {
        System.out.print("Enter the element : ");
        int element = sc.nextInt();

        Node newNode = new Node(element);
        if (rear == null || front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        return front;
    }

    public static Node delete(Node front , Node rear) {
        if (front == null) {
            System.out.println("Queue is Empty !!");
        } else {
            System.out.println(front.info + " is removed");
            front = front.next;
        }
        return front;
    }

    public static void display(Node front , Node rear) {
        if (front == null) {
            System.out.println("Queue is Empty !!");
        } else {
            Node currentNode = front;
            System.out.println("Element of Queue are : ");
            System.out.println("|");
            System.out.println("V");
            while (currentNode != null) {
                System.out.println(currentNode.info + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

    public static Node Rear(Node front) {
        if (front == null) {
            return null;
        } else {
            Node currentNode = front;
            while (currentNode != null) {
                currentNode = currentNode.next;
            }
            return currentNode;
        }
    }
}
