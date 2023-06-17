import java.util.*;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
}

class LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = null;

        while (true) {
            System.out.println("----> MENU <----");
            System.out.println("1. Insertion at the beginning of the list");
            System.out.println("2. Insertion at the end of the list");
            System.out.println("3. Insertion at the Any position of the list");
            System.out.println("4. Deletion of the Node from the beginning of the list");
            System.out.println("5. Deletion of the Node the end of the list");
            System.out.println("6. Deletion of the Node from any position of the list");
            System.out.println("7. Deletion of the Node based on the Registration Number");
            System.out.println("8. To Display the list");
            System.out.println("9. Exit");
            System.out.print("---> Enter your choice : ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1 : 
                    start = InsBeg(start);
                    break;
                case 2 :
                    start = InsEnd(start);
                    break;
                case 3 : 
                    start = InsAny(start);
                    break;
                case 4 :
                    start = DelBeg(start);
                    break;
                case 5 :
                    start = DelEnd(start);
                    break;
                case 6 : 
                    start = DelAny(start);
                    break;
                case 7 : 
                    start = DelByResgNo(start);
                case 8 : 
                    Display(start);
                    break;
                case 9 :
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default : 
                    System.out.println("Invalid Choice !!");
                    break;
            }
        }
    }

    //Creating Nodes
    public static void create(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Registration Number : ");
        start.regd_no = sc.nextInt();
        System.out.print("Enter your Mark : ");
        start.mark = sc.nextFloat();
        start.next = null;
    }

    //Inserting Node from the Beginning
    public static Node InsBeg(Node start) {
        Node newNode = new Node();
        create(newNode);

        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start = newNode;
        }
        System.out.println("Node is Inserted at the Beginning.");
        return start;
    }

    //Inseting Node  from the End
    public static Node InsEnd(Node start) {
        Node newNode = new Node();
        create(newNode);

        if(start == null) {
            start = newNode;
        } else {
            Node currentNode = start;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        System.out.println("Node is Inserted at the End.");
        return start;
    }

    //Inserting Node at any Position
    public static Node InsAny(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position you want to insert the Node : ");
        int position = sc.nextInt();

        if (position < 1) {
            System.out.println("Invalid Position");
            return start;
        } else if (position == 1) {
            start = InsBeg(start);
            return start;
        }

        Node newNode = new Node();
        create(newNode);
        Node currentNode = start;
        int count = 1;

        while (count < position - 1 && currentNode != null) {
            currentNode = currentNode.next;
            count++;
        }
        if (currentNode == null) {
            System.out.println("Invalid Position");
            return start;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        System.out.println("Node is Inserted at the position " + position);
        return start;
    }

    //Deleting Node from the Beginning
    public static Node DelBeg(Node start) {
        if (start == null) {
            System.out.println("List is Empty !!");
            return start;
        }
        start = start.next;
        System.out.println("Node is Deleted from the beginning.");
        return start;
    }

    //Deleting Node from the End
    public static Node DelEnd(Node start) {
        if (start == null) {
            System.out.println("List is Empty !!");
            return start;
        }
        if (start.next == null) {
            start = null;
            System.out.println("Node is Deleted from the End.");
            return start;
        }
        Node secondLastNode = start;
        Node lastNode = start.next;
        while (lastNode != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
        System.out.println("Node is Deleted from the End.");
        return start;
    }

    //Deleting Node at any Position
    public static Node DelAny(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position you want to delete the Node : ");
        int position = sc.nextInt();

        if (position < 1) {
            System.out.println("Invalid Position !!");
            return start;
        }
        if (position == 1) {
            start = DelBeg(start);
            return start;
        }
        Node currentNode = start;
        Node previusNode = null;
        int count = 1;
        while(count < position && currentNode != null) {
            previusNode = currentNode;
            currentNode = currentNode.next;
            count++;
        }
        if (currentNode == null) {
            System.out.println("Invalid position !!");
            return start;
        }
        previusNode.next = currentNode.next;
        currentNode.next = null;
        System.out.println("Node is Deleted at the position " + position);
        return start;
    }

    //Deleting Node according to the Registration Number
    public static Node DelByResgNo(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student registration number to be deleted : ");
        int reg = sc.nextInt();

        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }
        if (start.regd_no == reg) {
            start = start.next;
            System.out.println("Node is Deleted according to the Registration Number.");
            return start;
        }
        Node currentNode = start;
        Node previousNode = null;
        while (currentNode != null && currentNode.regd_no != reg) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if(currentNode == null) {
            System.out.println("Node with the registration Number " + reg + "has been deleted.");
            return start;
        }
        previousNode.next = currentNode.next;
        currentNode.next = null;
        System.out.println("Node deleted according to the registration Number.");
        return start;
    }

    //Displaying the list 
    public static void Display(Node start) {
        if (start == null) {
            System.out.println("List is Empty !!");
        } else {
            Node currenNode = start;
            while (currenNode != null) {
                System.out.println("Registration Number : " + currenNode.regd_no + "\nMark : " + currenNode.mark);
                System.out.println("  |");
                System.out.println("  V");
                currenNode = currenNode.next;
            }
            System.out.println("NULL");
        }
    }

}