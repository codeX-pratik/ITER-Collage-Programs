import java.util.*;

class Stack_Array_Implementation{

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        Object[] s = new Object[MAX];
        int top = -1;

        while (true) {
            System.out.println("---> MENY <---");
            System.out.println("0. Exit...");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.print("Enter your Choice : ");
            int choice = sc.nextInt();

            switch(choice) {
                case 0 : System.exit(0); break;
                case 1 : top = push(s, top); break;
                case 2 : top = pop(s, top); break;
                case 3 : display(s, top); break;
                default : System.out.println("Invalid Choice!!"); break;
            }
        }
    }

    public static final int MAX = 10;

    public static boolean isEmpty(int top) {
        return (top == -1);
    }
    public static boolean isFull(int top) {
        return top == MAX - 1;
    }

    public static int push(Object[] S , int top) {
        
        if (isFull(top)) {
            System.out.println("The stack is Full !!");
        } else {
            System.out.print("Enter the element : ");
            Object e = (Object) sc.next();
            S[++top] = e;
        }
        return top;
    }

    public static int pop(Object[] S , int top) {
        if (isEmpty(top)) {
            System.out.println("The Stack is Empty !!");
        } else {
            System.out.println("The " + S[top--] + " element is Poped");
        }
        return top;
    }

    public static void display(Object[] S , int top) {
        if (isEmpty(top)) {
            System.out.println("The Stack is Empty !!");
        } else {
            System.out.println("The stack Elements are : ");
            for (int i= top ; i>=0 ; i--) {
                System.out.println(S[i] + " ");
            }
            System.out.println();
        }
    }
}