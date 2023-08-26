import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node (int d) {
        data = d;
        next = null;
    }
}

public class N_LinkedList_stack {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node top = null;

        while (true) {
            System.out.println("---> MENU <---");
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.print("Enter your Choice : ");
            int choice = sc.nextInt();

            switch(choice) {
                case 0 : System.out.println("Exiting...");System.exit(0);; break;
                case 1 : top = push(top); break;
                case 2 : top = pop(top); break;
                case 3 : display(top); break;
                default : System.out.println("Invalid Choice"); break;
            }
        }
    }

    public static Node push(Node top) {
        System.out.print("Enter the element for stack : ");
        int e = sc.nextInt();
        Node NewNode = new Node(e);
        NewNode.next = top;
        top = NewNode;
        return top;
    }

    public static Node pop(Node top) {
        if (top == null) {
            System.out.println("Stack is Empty");
            return top;
        }
        System.out.println(top.data + " is Poped from the stack");
        top = top.next;
        return top;
    }

    public static void display(Node top) {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack element are : ");
        System.out.println("---> " + top.data);
        Node cNode = top.next;
        while (cNode != null) {
            System.out.println("     " + cNode.data);
            cNode = cNode.next;
        }
    }
}
