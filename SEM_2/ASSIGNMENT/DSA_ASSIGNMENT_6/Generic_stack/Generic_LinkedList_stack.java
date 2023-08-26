import java.util.*;

class Node<T> { 
    T data;
    Node<T> next;
    Node (T e) {
        data = e;
        next = null;
    }
}

public class Generic_LinkedList_stack {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node<Object> top = null;

        while (true) {
            System.out.println("---> MENU <---");
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.print("Enter your Choice : ");
            int choice = sc.nextInt();

            switch(choice) {
                case 0 : System.out.println("Exiting..."); System.exit(0); break;
                case 1 : top = push(top); break;
                case 2 : top = pop(top); break;
                case 3 : display(top); break;
                default : System.out.println("Invalid Choice"); break;
            }
        }
    }

    public static <T> Node<T> push(Node<T> top) {
        System.out.print("Enter the element for the Stack : ");
        T ele = (T) sc.next();
        Node<T> newNode = new Node<T>(ele);
        newNode.next = top;
        top = newNode;
        return top;
    }

    public static <T> Node<T> pop(Node<T> top) {
        if (top == null) {
            System.out.println("Stack is Empty");
        } 
        System.out.println(top.data + " is Poped");
        top = top.next;
        return top;
    }

    public static <T> void display(Node<T> top) {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack element are : ");
        System.out.println("---> " + top.data);
        Node<T> cNode = top.next;
        while (cNode != null) {
            System.out.println("     " + cNode.data);
            cNode = cNode.next;
        }
    }
}
