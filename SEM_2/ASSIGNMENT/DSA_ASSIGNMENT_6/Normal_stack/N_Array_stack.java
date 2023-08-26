import java.util.Scanner;

public class N_Array_stack {

    public static final int MAX = 10;
    public static int top = -1;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int S[] = new int[MAX];

        while (true) {
            System.out.println("---> MENU <---");
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.print("Enter your Choice : ");
            int choice = sc.nextInt();

            switch(choice){
                case 0 : System.out.println("Exiting...");System.exit(0); break;
                case 1 : top = push(S); break;
                case 2 : top = pop(S); break;
                case 3 : display(S); break;
                default : System.out.println("Invalid Choice"); break;
            }
        }
    }

    public static int push(int[]S) {
        if (top == MAX-1) {
            System.out.println("Stack is Full");
            return top;
        }
        System.out.print("Enter the element for stack : ");
        S[++top] = sc.nextInt();
        return top;
    }

    public static int pop(int[]S) {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return top;
        }
        System.out.println(S[top--] + " is Poped from the stack");
        return top;
    }

    public static void display(int[]S) {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("---> " + S[top]);
        for (int i=top-1 ; i>=0 ; i--) {
            System.out.println("     " + S[i]);
        }
        System.out.println();
    }
}
